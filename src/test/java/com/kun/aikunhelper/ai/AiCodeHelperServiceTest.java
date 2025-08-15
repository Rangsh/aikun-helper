package com.kun.aikunhelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeHelperServiceTest {

    @Resource
    private AiCodeHelperService aiCodeHelperService;

    @Test
    void chat() {
        String result = aiCodeHelperService.chat("你好我是天天困");
        System.out.println(result);
    }

    @Test
    void chatWithMemory() {
        String result = aiCodeHelperService.chat("你好我是天天困");
        System.out.println(result);
        result = aiCodeHelperService.chat("你好，你知道我是谁吗");
        System.out.println(result);
    }

    @Test
    void chatForReport() {
        String userMessage ="你好我是天天困，我学编程两年了，请你帮我制作一份面试题";
        AiCodeHelperService.Report report = aiCodeHelperService.chatForReport(userMessage);
        System.out.println(report);
    }
}
