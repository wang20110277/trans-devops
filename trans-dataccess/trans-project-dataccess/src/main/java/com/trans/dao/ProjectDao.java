package com.trans.dao;

import com.trans.model.Project;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectDao {
    int deleteByPrimaryKey(Long id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}