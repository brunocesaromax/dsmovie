# DS Movie   [![Build Status](https://app.travis-ci.com/brunocesaromax/dsmovie.svg?branch=main)](https://app.travis-ci.com/brunocesaromax/dsmovie)
[![NPM](https://img.shields.io/npm/l/express)](https://github.com/brunocesaromax/dsmovie/blob/main/LICENSE)

# Sobre o projeto

https://bruno-cesar-dsmovie.netlify.app/

DS Movie é uma aplicação full stack web construída durante o acompanhamento do evento __Semana DevSuperior 6.0__ organizado pela DevSuperior.

A aplicação consiste em avaliar filmes pela internet.

## Layout Web

![Img 1](https://github.com/brunocesaromax/dsmovie/blob/main/backend/src/main/resources/static/images/ds-movie1.png)
![Img 2](https://github.com/brunocesaromax/dsmovie/blob/main/backend/src/main/resources/static/images/ds-movie2.png)

## Modelo Conceitual

<img src="https://github.com/brunocesaromax/dsmovie/blob/main/backend/src/main/resources/static/images/class-diagram.png" width="500" height="800"/>

## Tecnologias utilizadas

### Back end
- Java 17
- Spring Boot 2.6.2
- JPA/ Hibernate
- H2 [test] (database: testdb | username: sa)
- PostgreSql (database: dsmovie | username: postgres  | password: 1234567)
- Maven 

### Front end
- HTML / CSS / JS / Typescript
- React / Axios

## Como executar o projeto

### Back end

Pré-requisitos: Java 17

  1 - Clonar o repositório: 
  
  ```bash 
  git clone https://github.com/brunocesaromax/dsmovie.git
  ```
  
  
  2 - Entrar na pasta do projeto back end: 
  
  ```bash 
  cd backend
  ```
  
  3 - Executar o projeto:
  
  
  ```bash 
  ./mvnw spring-boot:run
  ```

### Front end web

Pré-requisitos: node >= 16, npm >= 8

  1 - Clonar o repositório: 
  
  ```bash 
  git clone https://github.com/brunocesaromax/dsmovie.git
  ```
  
  
  2 - Entrar na pasta do projeto front end: 
  
  ```bash 
  cd front-web
  ```
  
  3 - Instalar dependências
  
  ```bash 
  npm install
  ```
  
  4 - Executar o projeto:
  
  
  ```bash
  npm start
  ```
  
# Autor

Bruno César Vicente
