package com.trans.param.project;

import lombok.Data;

@Data
public class ProjectRequestParam {
    private String organId;
    private String organName;
    private String projectId;
    private String projectName;
    private int platformType;
    private String platformTypeName;
}
