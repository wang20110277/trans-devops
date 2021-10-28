package com.trans.controller.project;

import com.trans.constants.ApiTypeConstant;
import com.trans.param.project.ProjectRequestParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "项目管理")
@RequestMapping(value = ApiTypeConstant.WEB_BASE_PATH + "/v1/project")
@RestController
public class ProjectManageController{
    @ApiOperation("创建项目")
    @PostMapping("/createProject")
    public void createProject(@RequestBody ProjectRequestParam projectRequestParam){

    }
}
