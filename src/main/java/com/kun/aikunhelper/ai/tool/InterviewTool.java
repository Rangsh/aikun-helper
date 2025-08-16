package com.kun.aikunhelper.ai.tool;

import dev.langchain4j.agent.tool.Tool;
import lombok.extern.slf4j.Slf4j;

/**
 * 自己实现工具，注意合法合规
 */
@Slf4j
public class InterviewTool {

    @Tool(name = "searchInterview",value = "自己实现")
    public String searchInterview(){
        return null;
    }
}
