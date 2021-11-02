package com.trans.controller.project;

import com.trans.constants.ApiTypeConstant;
import com.trans.param.project.ProjectRequestParam;
import com.trans.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "项目管理")
@RequestMapping(value = ApiTypeConstant.WEB_BASE_PATH + "/v1/project")
@RestController
public class ProjectManageController{
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
}
