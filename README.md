[![Github Actions Status for osmarbraz/calculadora_webspring](https://github.com/osmarbraz/calculadora_webspring/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/calculadora_webspring/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora_webspring&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=osmarbraz_calculadora_webspring)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=osmarbraz_calculadora_webspring&metric=coverage)](https://sonarcloud.io/component_measures?id=osmarbraz_calculadora_webspring&metric=coverage)
[![Docker](https://img.shields.io/badge/Docker-image-brightgreen)](https://hub.docker.com/r/osmarbraz/calculadora_webspring)

# Calculadora WEB com CI.

Aplicação **Calculadora WEB** desenvolvida em **Java** em 3 camadas utilizando **Spring Boot** em um container **Docker**.

## Ambientes

### Utiliza 3 ambientes:

 - dev - Desenvolvimento
 - hmg - Homologação
 - prd - Produção

### Pipeline 

 - dev - Compilação e testes.
 - hmg - Análise e cobertura de código.
 - prd - Empacotamento e distribuição.

## Sobre o projeto

 - O projeto foi desenvolvido no NetBeans deve ser chamado **calculadora_webspring**.
 - O projeto é uma calculadora para realizar as operações de adição, subtração, produto e divisão.
 - As classes do projeto estão organizadas nos pacotes formulário(Visão), controle e modelo.<br>
    - Formulário - Thymeleaf
    - Controle - Spring
    - Entidade - Model
 - Utiliza o **Java 8**.
 - Utiliza o **Apache Tomcat 9** como servidor de aplicações Web.
 - Utiliza o **Apache Maven** para automatizar o processo de construção da aplicação.
 - Utiliza o **Jib-Maven-Plugin** para criação das imagens Docker.
 - A aplicação é empacotada no formato **WAR (Web Application Archive)**.
 - Utiliza o **Docker** para criar uma imagem e executar a aplicação em um container.
 - A pasta test contêm os testes unitários do projeto utilizando **JUnit 5**.
 - Os testes no Github Actions são realizados no SO ubuntu-lastest e JDK 18.<br>
 - A cobertura do código é realizada através do **JaCoCo** e relatório enviado para o **Sonarcloud**.<br>
 - Distribuição para **Docker Hub**.

# Comandos Docker
 - Utilizar o terminal do Windows Powershel em modo administrador.

### Construir a aplicação
 - ```mvn compile jib:dockerBuild```

### Executar a aplicação
 - ```docker run -d -p 8080:8080 osmarbraz/calculadora_webspring:0.0.1```

 


 

 