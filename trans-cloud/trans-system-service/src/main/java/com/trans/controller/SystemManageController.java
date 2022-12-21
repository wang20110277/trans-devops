package com.trans.controller;

import com.trans.constants.ApiTypeConstant;
import com.trans.dto.project.ProjectDto;
import com.trans.param.project.ProjectRequestParam;
import com.trans.response.ResponseResult;
import com.trans.service.outer.SystemProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "项目管理")
@RequestMapping(value = ApiTypeConstant.WEB_BASE_PATH + "v1")
@RestController
public class SystemManageController {
    @Autowired
    private SystemProjectService systemProjectService;

    @ApiOperation("创建项目")
    @PostMapping("/createProject")
    public ResponseResult<String> createProject(@RequestBody ProjectRequestParam projectRequestParam){
        return ResponseResult.success("收到");
    }

    @ApiOperation("获取所有项目")
    @GetMapping("/getAllProject")
    public ResponseResult<String> getAllProject(){
        return ResponseResult.success("收到");
    }

    @ApiOperation("根据Id获取项目")
    @GetMapping("/getProjectById")
    public ResponseResult<ProjectDto> getProjectById(int id){
        ProjectDto projectDto=systemProjectService.findById(id);
        return ResponseResult.success(projectDto);
    }
}
