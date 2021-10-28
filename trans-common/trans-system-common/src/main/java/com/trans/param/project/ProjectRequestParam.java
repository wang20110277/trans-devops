package com.trans.param.project;

import lombok.Data;

@Data
public class ProjectRequestParam {
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
}
