package org.boreas320.ideaplugindemo.component.impl;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.boreas320.ideaplugindemo.component.SayHelloComponent;

/**
 * @description:
 * @author: boreas
 * @date: 2019-06-02
 * @time: 04:54
 * Copyright (C) 2019 MTDP
 * All rights reserved
 */
public class SayHelloComponentImpl implements SayHelloComponent {
    private Project project;
    public SayHelloComponentImpl(Project project) {
        this.project = project;
    }

    @Override
    public void projectOpened() {
        Messages.showMessageDialog(String.format("当前项目名称是%s",project.getName()),"展示项目名称",Messages.getErrorIcon());
    }
}
