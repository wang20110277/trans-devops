package com.trans.controller;

import com.trans.api.service.ProjectManagerService;
import com.trans.dto.project.ProjectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project/api/v1")
public class ProjectManagerController {
    @Autowired
    private ProjectManagerService projectManagerService;

    @GetMapping("/findById")
    ProjectDto findById(@RequestParam int id){
        ProjectDto projectDto=projectManagerService.findById(id);
        return projectDto;
    }
}
