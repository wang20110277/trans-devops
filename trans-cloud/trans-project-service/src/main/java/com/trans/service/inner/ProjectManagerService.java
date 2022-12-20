package com.trans.service.inner;

import com.baomidou.mybatisplus.extension.service.IService;
import com.trans.model.TransProject;

public interface ProjectManagerService extends IService<TransProject> {
    void createTransProject(TransProject transProject);
    void updateTransProject(TransProject transProject);
    void deleteTransProject(TransProject transProject);
    TransProject findById(int id);
}
