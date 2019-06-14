package org.boreas320.ideaplugindemo.view;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @description:
 * @author: boreas
 * @date: 2019-06-03
 * @time: 00:57 Copyright (C) 2019 MTDP All rights reserved
 */
public class DemoToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        DemoToolWindow demoToolWindow = new DemoToolWindow();
        ContentFactory factory = ContentFactory.SERVICE.getInstance();
        Content content = factory.createContent(demoToolWindow.getMainPanel(), "咦?", false);
        toolWindow.getContentManager().addContent(content);
        Content content1 = factory.createContent(demoToolWindow.getMainPanel(), "咦?", false);
        toolWindow.getContentManager().addContent(content1);
    }
}
