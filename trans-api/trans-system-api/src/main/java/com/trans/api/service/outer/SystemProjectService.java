package com.trans.api.service.outer;

import com.trans.dto.project.ProjectDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "trans-project")
public interface SystemProjectService {
    @GetMapping("/project/api/v1/findById")
    ProjectDto findById(int id);
}
