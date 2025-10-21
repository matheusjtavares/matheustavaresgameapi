# 🧩 Games API

## ⚙️ Funcionalidade Desenvolvida

### 🧠 **Arquitetura de aplicação**
Monólito modular com 3 modulos abaixo de games-parent
---

## 🏗️ Principais Classes de Modelo e Modulos da aplicação

### **Modelos**
| Classe | Descrição |
|--------|------------|
| `GameTitle` | Versão simplificada importada do projeto anterior
| `Platform` | Versão simplificada importada do projeto anterior
| `User` | Classe De usuário

### **Módulos**
| Modulo | Descrição |
|--------|------------|
| `Common-domain` | Classes do domínio geral |
| `external-api` | Rotas de comunicação com a api externa de thegamesDB.com |
| `main-app` | Rotas de comunicação com a api externa de thegamesDB.com |


## 🤖 Postman Collection

You can explore and test the API endpoints via the shared Postman
workspace under the games-parent folder:\
[Game Sharing Platform API
(Postman)](https://planetary-flare-256668.postman.co/workspace/Infnet-Springboot~a289eb5a-c4ef-4cf7-a5d8-e310d62bd091/collection/47974878-a6f2167a-ad19-4f15-84ec-e9ca2ff69e01?action=share&creator=47974878)


### Prerequisites

-   Java 21+
-   Maven 3.8+
-   Spring Boot 3+

### Running the Application

``` bash
mvn spring-boot:run
```

### Accessing the API

Once the app is running, you can access the API at:

    http://localhost:8080/api/platforms

### Users for testing
    admin:admin123
    user:user123