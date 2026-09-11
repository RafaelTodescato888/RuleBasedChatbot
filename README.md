# Nortinho — Assistente Virtual em Java

## Visão geral

O Nortinho é um chatbot de linha de comando desenvolvido em Java, criado para simular um assistente virtual de atendimento de um banco.

A aplicação funciona de forma determinística e baseada em regras: ela recebe uma mensagem do usuário, normaliza o texto, separa as palavras e utiliza uma árvore de intenções para descobrir qual resposta deve ser apresentada.

O projeto não utiliza, no código fornecido, inteligência artificial, processamento de linguagem natural, banco de dados ou integração com APIs externas. O conhecimento do bot é definido diretamente no código por meio da classe IntentionTreeSeed.

---

## Arquitetura

A organização do código pode ser entendida em três grandes responsabilidades:

```text
src/
├── application/
│   ├── constants/
│   │   └── IntentionTreeSeed.java
│   ├── helpers/
│   │   └── TextHelper.java
│   └── services/
│       └── ChatbotService.java
│
├── domain/
│   ├── Chat.java
│   ├── IntentionTree.java
│   ├── IntentionTreeNode.java
│   └── MessageContext.java
│
└── App.java
```

### App

É o ponto de entrada da aplicação.

Seu papel é simples:

1. Instanciar ChatbotService.
2. Iniciar a conversa por meio de startConversation().

Fluxo:

```text
App
 └── ChatbotService
      └── startConversation()
```

---
