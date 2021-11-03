package com.trans.api.service.inner;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trans.dto.project.ProjectDto;
import com.trans.model.TransProject;

public interface ProjectManagerService extends IService<TransProject> {
    void createTransProject(ProjectDto projectDto);
    void updateTransProject(ProjectDto projectDto);
    void deleteTransProject(ProjectDto projectDto);
    ProjectDto findById(int id);
}
