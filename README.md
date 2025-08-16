# AI Kun Helper - Java后端面试AI助手

一个基于Spring Boot和LangChain4j构建的智能面试辅导系统，专注于Java后端开发岗位的面试准备和技能提升。

## 🚀 项目简介

AI Kun Helper是一个现代化的AI驱动面试辅导平台，集成了阿里云通义千问大模型，为Java后端开发求职者提供专业的面试指导和技能评估。系统采用流式对话技术，提供实时、智能的面试问答体验。

## ✨ 核心特性

- **🤖 智能面试官**: 基于十年经验的Java后端面试官角色设计
- **📚 全面知识覆盖**: 涵盖Java基础、数据库、框架原理、系统设计等核心领域
- **💬 流式对话**: 支持Server-Sent Events的实时对话体验
- **🛡️ 安全防护**: 内置输入安全防护机制
- **🔧 模块化设计**: 清晰的分层架构，易于扩展和维护
- **📖 RAG支持**: 集成检索增强生成，提供更准确的答案

## 🏗️ 技术架构

### 后端技术栈
- **框架**: Spring Boot 3.5.4
- **AI引擎**: LangChain4j 1.1.0
- **大模型**: 阿里云通义千问 (Qwen-Max)
- **响应式编程**: Project Reactor
- **构建工具**: Maven
- **Java版本**: JDK 21

## 🚀 快速开始

### 环境要求
- JDK 21+
- Maven 3.6+
- 阿里云通义千问API密钥

### 安装步骤

1. **克隆项目**
```bash
git clone https://github.com/Rangsh/aikun-helper.git
cd aikun-helper
```

2. **配置API密钥**

编辑 `src/main/resources/application.yml` 文件，填入你的API密钥：
```yaml
langchain4j:
  community:
    dashscope:
      chat-model:
        api-key: your-dashscope-api-key
      embedding-model:
        api-key: your-dashscope-api-key
      streaming-chat-model:
        api-key: your-dashscope-api-key
```

3. **构建并运行**
```bash
# 使用Maven构建
./mvnw clean package

# 运行应用
./mvnw spring-boot:run
```

4. **访问服务**

应用启动后，访问 `http://localhost:8080/api`

## 📡 API接口

### 流式对话接口
```http
GET /api/ai/chat?memoryId={memoryId}&message={message}
```

**参数说明:**
- `memoryId`: 会话记忆ID，用于维持对话上下文
- `message`: 用户输入的消息内容

**响应格式:** Server-Sent Events (SSE)

**示例请求:**
```bash
curl -N "http://localhost:8080/api/ai/chat?memoryId=1&message=请问Java中HashMap的底层实现原理是什么？"
```


## 🔧 项目结构

```
src/main/java/com/kun/aikunhelper/
├── AikunHelperApplication.java          # 应用启动类
└── ai/
    ├── AiCodeHelperService.java         # AI服务接口
    ├── AiCodeHelperServiceFactory.java  # 服务工厂
    ├── config/
    │   └── CorsConfig.java              # 跨域配置
    ├── controller/
    │   └── AiController.java            # REST控制器
    ├── guardrail/
    │   └── SafeInputGuardrail.java      # 输入安全防护
    ├── model/
    │   └── QwenChatModelConfig.java     # 模型配置
    ├── rag/
    │   └── RagConfig.java               # RAG配置
    └── tool/
        └── InterviewTool.java           # 面试工具
```

## 🎨 前端开发

本项目专注于后端API服务。如需前端界面，建议使用现代AI编程助手（如GitHub Copilot、Cursor等）快速生成前端代码：

### 推荐技术栈
- **框架**: React/Vue.js/Angular
- **UI库**: Ant Design/Element UI/Material-UI
- **HTTP客户端**: Axios/Fetch API
- **SSE支持**: EventSource API


## ⚠️ 免责声明与学习声明

### 📖 学习目的声明
本项目是作者在学习Spring Boot、LangChain4j和AI集成技术过程中的实践项目，主要目的是：
- 深入理解现代Java后端开发技术栈
- 探索AI技术在实际项目中的应用
- 提升系统架构设计和编程实践能力
- 为技术社区贡献学习成果和经验分享


### ⚖️ 使用须知
- **仅供学习研究**: 本项目专为技术学习和研究而创建，不用于商业用途
- **API使用规范**: 请合理使用第三方API配额，遵守服务提供商的使用条款
- **内容参考性**: 项目中的面试题目和技术答案仅供学习参考，实际应用请结合具体场景


⭐ 如果这个项目对你的学习有帮助，欢迎给个星标支持！

📚 **学而时习之，不亦说乎** - 持续学习，共同进步！
