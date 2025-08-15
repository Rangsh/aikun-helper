package com.kun.aikunhelper.ai;

import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AICodeHelperTest {

    @Resource
    private AICodeHelper aiCodeHelper;

    @Test
    void chat() {
        aiCodeHelper.chat("你好我是天天困，你是谁");
    }

    @Test
    void chatWithMessage() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("描述图片"),
                ImageContent.from("图片地址自己填写")
        );
        aiCodeHelper.chatWithMessage(userMessage);
    }
}
