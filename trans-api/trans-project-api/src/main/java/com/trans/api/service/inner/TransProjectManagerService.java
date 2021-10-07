package com.trans.api.service.inner;

import com.trans.api.dto.TransProjectDto;

public interface TransProjectManagerService {
    void createTransProject(TransProjectDto transProjectDto);
    void updateTransProject(TransProjectDto transProjectDto);
    void deleteTransProject(TransProjectDto transProjectDto);
}
