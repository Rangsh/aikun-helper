package com.kun.aikunhelper.ai;


import dev.langchain4j.service.Result;
import dev.langchain4j.service.SystemMessage;

import java.util.List;

public interface AiCodeHelperService {

    @SystemMessage(fromResource = "system-prompt.txt")
    String chat(String userMessage);

    @SystemMessage(fromResource = "system-prompt.txt")
    Report chatForReport(String userMessage);

    //面试题
    record Report(String name, List<String> suggestionList){}

    //返回封装后的结果
    @SystemMessage(fromResource = "system-prompt.txt")
    Result<String> chatWithRag(String userMessage);
}
