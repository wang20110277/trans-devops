package com.trans.api.service;

import com.trans.dto.project.ProjectDto;

public interface ProjectManagerService {
    void createTransProject(ProjectDto projectDto);
    void updateTransProject(ProjectDto projectDto);
    void deleteTransProject(ProjectDto projectDto);
}
