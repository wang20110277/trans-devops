package com.trans.dto.project;

import lombok.Data;

import java.util.Date;

@Data
public class ProjectDto {
    //组织机构编号
    private String organId;
    //组织机构名称
    private String organName;
    //项目编号
    private String projectId;
    //项目名称
    private String projectName;
    //平台类型编号
    private int platformType;
    //平台类型名称
    private String platformTypeName;
    //原型设计地址
    //需求池地址
    //代码库地址
    //构建平台地址
    //制品库地址
    //测试地址
    //发布地址
    private Date createTime;
    private Date updateTime;
}
