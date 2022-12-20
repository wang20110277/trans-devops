package com.trans.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
// MyBatisPlus 表映射注解
@TableName(value = "trans_project")
public class TransProject {
    @TableId(type= IdType.AUTO)
    private int id;
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

    private Date createTime;

    private Date updateTime;
}
