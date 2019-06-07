package com.revature.assignforce.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.assignforce.beans.SkillsNotifierBean;
import org.springframework.cloud.aws.messaging.core.NotificationMessagingTemplate;

public interface SkillSNSNotifier {
    void sendDeleteNotification(SkillsNotifierBean skillsNotifierBean);
    void sendAddNotification(SkillsNotifierBean skillsNotifierBean);

    default void send(String topic, String subject, SkillsNotifierBean skillsNotifierBean, NotificationMessagingTemplate template) {
        String message = null;
        try {
            message = new ObjectMapper().writeValueAsString(skillsNotifierBean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        template.sendNotification(topic, message, subject);
    }
}
