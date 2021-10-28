package com.trans.config.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@MapperScan(value = "com.trans.dao", sqlSessionFactoryRef = "sqlSessionFactory")
public class DataSourcesConfig {
	// 主数据库连接
	@Value("${datasource.master.jdbcUrl}")
	private String jdbcUrlMaster;
	@Value("${datasource.master.username}")
	private String usernameMaster;
	@Value("${datasource.master.password}")
	private String passwordMaster;
	// 从数据库连接
	@Value("${datasource.slave.jdbcUrl}")
	private String jdbcUrlSlave;
	@Value("${datasource.slave.username}")
	private String usernameSlave;
	@Value("${datasource.slave.password}")
	private String passwordSlave;

	// 数据库公共配置
	@Value("${datasource.driverClassName}")
	private String driverClassName;
	@Value("${datasource.connectionTestQuery}")
	private String connectionTestQuery;
	@Value("${datasource.connectionTimeoutMs}")
	private Long connectionTimeoutMs;
	@Value("${datasource.idleTimeoutMs}")
	private Long idleTimeoutMs;
	@Value("${datasource.maxLifetimeMs}")
	private Long maxLifetimeMs;
	@Value("${datasource.maxPoolSize}")
	private Integer maxPoolSize;
	@Value("${datasource.minIdle}")
	private Integer minIdle;
	@Value("${datasource.transactionTimeoutS}")
	private Integer transactionTimeoutS;
	/**
	 * 获取返回数据源
	 * 
	 * @return
	 */
	private HikariDataSource getAbstractDataSource() {
		final HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName(this.driverClassName);
		dataSource.setConnectionTestQuery(this.connectionTestQuery);
		dataSource.setConnectionTimeout(this.connectionTimeoutMs);
		dataSource.setIdleTimeout(this.idleTimeoutMs);
		dataSource.setMaxLifetime(this.maxLifetimeMs);
		dataSource.setMaximumPoolSize(this.maxPoolSize);
		dataSource.setMinimumIdle(this.minIdle);
		return dataSource;
	}

	/**
	 * 主数据库数据源
	 * 
	 * @return
	 */

	@Bean(name = "masterDataSource")
	public DataSource getMasterDataSource() {
		HikariDataSource dataSource = this.getAbstractDataSource();
		dataSource.setJdbcUrl(this.jdbcUrlMaster);
		dataSource.setUsername(this.usernameMaster);
		dataSource.setPassword(this.passwordMaster);
		return dataSource;
	}

	/**
	 * 从数据库数据源
	 * 
	 * @return
	 */
	@Bean(name = "slaveDataSource")
	public DataSource getSlaveDataSource() {
		HikariDataSource dataSource = this.getAbstractDataSource();
		dataSource.setJdbcUrl(this.jdbcUrlSlave);
		dataSource.setUsername(this.usernameSlave);
		dataSource.setPassword(this.passwordSlave);
		return dataSource;
	}

	/**
	 * 获取动态数据源实现类
	 * 
	 * @return
	 */
	@Bean
	public DynamicDataSource getDynamicDataSource() {
		DynamicDataSource dynamicDataSource = DynamicDataSource.getInstance();
		// 默认主数据源
		dynamicDataSource.setDefaultTargetDataSource(this.getMasterDataSource());
		dynamicDataSource.setTargetDataSources(new HashMap<Object, Object>() {
			{
				this.put("master", getMasterDataSource());
				this.put("slave", getMasterDataSource());
			}
		});
		return dynamicDataSource;
	}

	/**
	 * mybatis 的sessionFactory
	 *
	 * @return
	 * @throws Exception
	 */
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(this.getDynamicDataSource());
		// 扫描mapper.xml
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	/**
	 * 数据源事务管理器
	 * 
	 * @return
	 */
	@Bean(name = "transactionManager")
	public DataSourceTransactionManager getTransactionManager() {
		return new DataSourceTransactionManager(getMasterDataSource());
	}

	/**
	 * 编程式事务
	 * 
	 * @return
	 */
	@Bean(name = "transactionTemplate")
	public TransactionTemplate getTransactionTemplate() {
		DataSourceTransactionTemplate transactionTemplate = new DataSourceTransactionTemplate();
		transactionTemplate.setTimeout(this.transactionTimeoutS);
		transactionTemplate.setTransactionManager(this.getTransactionManager());
		return transactionTemplate;
	}
}