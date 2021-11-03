package com.trans.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * project
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Project")
public class Project{
    private Long id;

    private String pname;

    private String url;

    private String lead;

    private String description;

    private String pkey;

    private Long pcounter;

    private Long assigneetype;

    private Long avatar;

    private String originalkey;

    private String projecttype;
}