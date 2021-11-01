package com.trans.datasource;

import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class DataSourceTransactionTemplate extends TransactionTemplate {
	private static final long serialVersionUID = 7978292239094603798L;

	/**
	 * 执行事务初设置数据源
	 */
	@Override
	public <T> T execute(TransactionCallback<T> action) throws TransactionException {
		DataSourceSwitcher.setMasterWithDontChangeSetMode();// 设置为主数据库
		return super.execute(action);
	}

}
