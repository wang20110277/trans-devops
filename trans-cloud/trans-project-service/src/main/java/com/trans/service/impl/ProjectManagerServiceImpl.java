package com.trans.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trans.dao.TransProjectDao;
import com.trans.model.TransProject;
import com.trans.service.inner.ProjectManagerService;
import org.springframework.stereotype.Service;

@Service
public class ProjectManagerServiceImpl extends ServiceImpl<TransProjectDao, TransProject> implements ProjectManagerService {
    @Override
    public void createTransProject(TransProject projectDto) {

    }

    @Override
    public void updateTransProject(TransProject projectDto) {

    }

    @Override
    public void deleteTransProject(TransProject projectDto) {

    }

    @Override
    public TransProject findById(int id) {
        return null;
    }
}
