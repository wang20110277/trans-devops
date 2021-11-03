package com.trans.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trans.dao.TransProjectDao;
import com.trans.dto.project.ProjectDto;
import com.trans.api.service.inner.ProjectManagerService;
import com.trans.model.TransProject;
import org.springframework.stereotype.Service;

@Service
public class ProjectManagerServiceImpl extends ServiceImpl<TransProjectDao, TransProject> implements ProjectManagerService {
    @Override
    public void createTransProject(ProjectDto projectDto) {

    }

    @Override
    public void updateTransProject(ProjectDto projectDto) {

    }

    @Override
    public void deleteTransProject(ProjectDto projectDto) {

    }

    @Override
    public ProjectDto findById(int id) {
        return null;
    }
}
