# ⚙️ Desafio-POI — API Spring Boot (Java 21)

![Java](https://img.shields.io/badge/Java-21-ED8B00)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.1-6DB33F)
![H2](https://img.shields.io/badge/DB-H2-blue)
![Build](https://img.shields.io/badge/build-Maven-C71A36)
![Status](https://img.shields.io/badge/status-Demo-lightgrey)

API Web em **Java 21 com Spring Boot**, voltada para cadastro, listagem e descoberta de **Pontos de Interesse (POIs)** utilizando banco em memória **H2**.

---

## 📚 Sumário

- [💡 Descrição Curta](#-descrição-curta)
- [🧩 Tecnologias e Stack](#-tecnologias-e-stack)
- [✨ Funcionalidades Principais](#-funcionalidades-principais)
- [🚀 Endpoints](#-endpoints)
- [📦 Execução Local](#-execução-local)
- [🌱 Dados Iniciais](#-dados-iniciais)
- [📂 Estrutura do Projeto](#-estrutura-do-projeto)

## 💡 Descrição Curta

Implementa CRUD básico de pontos de interesse, com paginação e busca por proximidade (raio Euclidiano) a partir de uma coordenada informada.

## 🧩 Tecnologias e Stack

- Java 21 e Spring Boot (webmvc, data-jpa, actuator)
- Banco H2 em memória com console habilitado
- Maven como gerenciador de build
- Jakarta Persistence (JPA) com queries derivadas e JPQL customizado

## ✨ Funcionalidades Principais

- Cadastro de POI (nome, coordenadas X e Y)
- Listagem paginada de POIs
- Busca de POIs próximos a um ponto dado um raio `dmax`

## 🚀 Endpoints

- Criar POI: `POST /points-of-interests` (body JSON)
- Listar POIs: `GET /points-of-interests-list?page=0&pageSize=10`
- Buscar próximos: `POST /near-me?x=20&y=10&dmax=10`

### Payload de criação de POI

```json
{
   "name": "Lanchonete",
   "x": 27,
   "y": 12
}
```

### Resposta de busca por proximidade (`/near-me`)

```json
[
   {
      "name": "Posto",
      "x": 31,
      "y": 18
   }
]
```

> Observação: o cálculo usa raio Euclidiano (`sqrt((x1 - x2)^2 + (y1 - y2)^2)`).

## 📦 Execução Local

1. Pré-requisitos: Java 21+ e Maven instalados.
2. No diretório do módulo: `cd poi`
3. Suba a aplicação: `mvn spring-boot:run`
4. A API responde em `http://localhost:8080` (H2 console disponível em `/h2-console`).

## 🌱 Dados Iniciais

Ao subir a aplicação, alguns POIs são semeados automaticamente:

- Lanchonete (27, 12)
- Posto (31, 18)
- Joalheria (15, 12)
- Floricultura (19, 21)
- Pub (12, 8)
- Supermercado (23, 6)
- Churrascaria (28, 2)

## 📂 Estrutura do Projeto

```
Desafio-POI-
├── README.md
├── poi/
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/tech/JV/poi/
│   │   │   │   ├── PoiApplication.java
│   │   │   │   ├── Controller/PointOfInterestController.java
│   │   │   │   ├── Entity/PointOfInterest.java
│   │   │   │   └── Repository/PointOfInterestRepository.java
│   │   │   └── resources/application.properties
```

---

Projeto inspirado no desafio de Points of Interest da comunidade backend-br.
