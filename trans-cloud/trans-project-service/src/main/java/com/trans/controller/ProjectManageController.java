package com.trans.controller;

import com.trans.constants.ApiTypeConstant;
import com.trans.model.TransProject;
import com.trans.service.inner.ProjectManagerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "项目管理")
@RefreshScope
@RestController
@RequestMapping(value = ApiTypeConstant.PROJECT_BASE_PATH+"v1")
public class ProjectManageController {
    @Autowired
    private ProjectManagerService projectManagerService;

    @GetMapping("/findById")
    TransProject findById(@RequestParam int id){
        TransProject projectDto=projectManagerService.findById(id);
        return projectDto;
    }
}
