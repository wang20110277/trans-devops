package com.trans.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trans.model.Project;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectDao extends BaseMapper<Project> {
}