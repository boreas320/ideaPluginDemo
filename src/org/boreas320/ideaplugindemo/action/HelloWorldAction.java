package org.boreas320.ideaplugindemo.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * @description:
 * @author: boreas
 * @date: 2019-06-01
 * @time: 23:03 Copyright (C) 2019 MTDP All rights reserved
 */
public class HelloWorldAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        Messages.showMessageDialog(project, String.format("HelloWorld! %s",project.getName()), "First", Messages.getInformationIcon());

    }
}
