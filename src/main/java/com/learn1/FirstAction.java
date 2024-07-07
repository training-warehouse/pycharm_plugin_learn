package com.learn1;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;

public class FirstAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        NotificationGroup notificationG = new NotificationGroup("first_id", NotificationDisplayType.BALLOON, true);
        Notification notification = notificationG.createNotification("点击测试", MessageType.INFO);
        Notifications.Bus.notify(notification);
    }
}
