# 📧 Email Notification System

Sistema de envio de e-mails em massa com personalização de conteúdo,
gerenciamento de contatos e grupos, utilizando mensageria com RabbitMQ.

------------------------------------------------------------------------

## 🚀 Objetivo do Projeto

Este projeto foi desenvolvido com foco em **aprendizado de mensageria
com RabbitMQ**, utilizando uma arquitetura baseada em eventos para
processamento assíncrono de envio de e-mails.

------------------------------------------------------------------------

## 🏗️ Tecnologias Utilizadas

### 🔹 Backend

-   Java 21+
-   Spring Boot
-   Spring Web
-   Spring Data JPA
-   RabbitMQ
-   PostgreSQL
-   Maven

### 🔹 Frontend

-   Angular

------------------------------------------------------------------------

## 📌 Funcionalidades

### 📬 Envio de E-mails

-   Envio individual
-   Envio para múltiplos contatos
-   Envio para grupos inteiros
-   Processamento assíncrono via RabbitMQ

------------------------------------------------------------------------

### 👥 Gerenciamento de Contatos

-   Cadastro de contatos
-   Listagem de contatos
-   Edição e exclusão

------------------------------------------------------------------------

### 🗂️ Gerenciamento de Grupos

-   Cadastro de grupos
-   Associação de contatos a grupos
-   Envio de e-mail para todos os membros do grupo

------------------------------------------------------------------------

### ✉️ Personalização com Variáveis Dinâmicas

O sistema permite o uso de variáveis dentro do corpo do e-mail.

Exemplo:

    Olá {nome},

    Lembrando que semana que vem segunda e terça é feriado na firma.

Variáveis suportadas: - `{nome}` - `{email}`

Durante o envio, o sistema substitui automaticamente as variáveis pelos
dados reais do contato.

------------------------------------------------------------------------

### 📊 Dashboard

Painel administrativo com: - Total de e-mails enviados - Total de
contatos cadastrados - Total de grupos - Histórico de envios - Status
(Processando, Enviado, Erro)

------------------------------------------------------------------------

## 🐰 Uso do RabbitMQ

Fluxo de envio:

Producer → Exchange → Queue → Consumer

Vantagens: - Processamento assíncrono - Melhor performance -
Escalabilidade - Tolerância a falhas

------------------------------------------------------------------------

## 🗄️ Modelagem Inicial

Entidades principais: - Contato - Grupo - EmailEnvio

------------------------------------------------------------------------

## ⚙️ Como Rodar o Projeto

### 1️⃣ Clonar o repositório

    git clone <url-do-repositorio>

------------------------------------------------------------------------

### 2️⃣ Subir RabbitMQ com Docker

    docker-compose up -d

Acessar painel: http://localhost:15672

------------------------------------------------------------------------

### 3️⃣ Configurar PostgreSQL

Criar banco:

    CREATE DATABASE email_notification;

Configurar `application.yml`:

    spring:
      datasource:
        url: jdbc:postgresql://localhost:5432/email_notification
        username: postgres
        password: postgres

------------------------------------------------------------------------

## 🎯 Objetivo Acadêmico

-   Aprender arquitetura orientada a eventos
-   Trabalhar com RabbitMQ
-   Praticar separação de camadas
-   Integrar Angular + Spring Boot

------------------------------------------------------------------------

## 🔮 Melhorias Futuras

-   Templates de e-mail
-   Upload CSV
-   Agendamento de envio
-   Retry automático
-   Autenticação JWT
-   Logs estruturados
