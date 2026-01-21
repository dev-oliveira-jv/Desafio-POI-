# Desafio-POI-
Resolução do Desafio presente no repositório [https://github.com/backend-br/desafios/blob/master/points-of-interest/PROBLEM.md]

## Estrutura do Projeto

```
Desafio-POI-
├── README.md
├── poi/
│   ├── .gitattributes
│   ├── .gitignore
│   ├── HELP.md
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── tech/
│   │   │   │       └── JV/
│   │   │   │           └── poi/
│   │   │   │               ├── PoiApplication.java
│   │   │   │               ├── Controller/
│   │   │   │               │   └── PointOfInterestController.java
│   │   │   │               ├── Entity/
│   │   │   │               │   └── PointOfInterest.java
│   │   │   │               └── Repository/
│   │   │   │                   └── PointOfInterestRepository.java
│   │   │   └── resources/
│   │   │       └── application.properties
```

## Como Iniciar o Projeto

1. Certifique-se de ter o [Maven](https://maven.apache.org/download.cgi) instalado em sua máquina.
2. Navegue até o diretório do projeto:
   ```bash
   cd c:\F\Desafio-POI-
   ```
3. Execute o seguinte comando para iniciar a aplicação:
   ```bash
   mvn spring-boot:run
   ```
4. A aplicação estará disponível em `http://localhost:8080`.

## Classes e Funções

- **PoiApplication**: Classe principal que inicia a aplicação Spring Boot.
- **PointOfInterestController**: Controlador responsável por gerenciar as requisições relacionadas aos pontos de interesse.
- **PointOfInterest**: Entidade que representa um ponto de interesse no sistema.
- **PointOfInterestRepository**: Interface que gerencia a persistência dos pontos de interesse.
