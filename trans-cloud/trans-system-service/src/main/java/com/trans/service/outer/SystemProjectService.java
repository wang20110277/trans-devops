package com.trans.service.outer;

import com.trans.constants.ApiTypeConstant;
import com.trans.dto.project.ProjectDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "trans-project")
public interface SystemProjectService {
    @GetMapping(ApiTypeConstant.PROJECT_BASE_PATH+"v1"+"/findById")
    ProjectDto findById(int id);
}
