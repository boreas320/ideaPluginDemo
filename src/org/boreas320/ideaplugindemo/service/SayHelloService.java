package org.boreas320.ideaplugindemo.service;

import com.intellij.openapi.components.ServiceManager;

/**
 * @description:
 * @author: boreas
 * @date: 2019-06-02
 * @time: 04:46
 * Copyright (C) 2019 MTDP
 * All rights reserved
 */
public interface SayHelloService {
    static SayHelloService getInstance() {
        return ServiceManager.getService(SayHelloService.class);
    }
}
