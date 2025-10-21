# 🧩 Games API

## ⚙️ Funcionalidade Desenvolvida

### 🧠 **Nova Classe de Negócio Rental Order**
Esta classe será utilizada para fazer o pedido de aluguel de cópias de jogos selecionadas.
Uma vez concluída ela pode ser integrada para permitir que os players da aplicação anterior possam interagir com as bibliotecas uns dos outros.
---

## 🏗️ Principais Classes de Modelo e Serviço

### **Modelos**
| Classe | Descrição |
|--------|------------|
| `GameCopy` | Versão simplificada importada do projeto anterior
| `RentalOrder` | Registra pedidos de múltiplas unidades de jogo em um carrinho |

### **Serviços**
| Classe | Descrição |
|--------|------------|
| `RentalOrderService` | Processamento de pedidos criados/gerados |

---

## 🧪 Cenários de Teste Unitário

A seguir, os  testes criados para garantir a robustez da nova funcionalidade.

| DisplayName | Descrição | Ciclo Red-Green-Refactor |
|--------------|------------|--------------------------|
| **"Must throw GameCopyInvalidException when ID is less than 1"** | Verifica se o erro está sendo jogado corretamente pelo sistema | **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **"Must throw GameCopyInvalidException ownedSinceDate is in the future"** | Verifica se o erro está sendo jogado corretamente pelo sistema | **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **"Must Calculate Rental Total Price when given valid game copies"** | Percorre e avalia o resultado gerado no método getTotalRentalPrice()| **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **Must Return zero with empty rental cart"** | Percorre e avalia o resultado gerado no método getTotalRentalPrice()| **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **"Must prevent set when maximum dayus are exceeded" ** | Verifica e não adicionada nenhum item inválido ao rentalCart | **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **"Must prevent set when not available for rental" ** | Verifica e não adicionada nenhum item inválido ao rentalCart | **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **"Must prevent set when duplicates are added to rental"** | Verifica e não adicionada nenhum item inválido ao rentalCart | **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **"Must return true when the total price in cart is greater than 0" ** | Valida a persistência da rentalOrder | **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |
| **"Must return false when the total price in cart is less than 0" ** | Valida a persistência da rentalOrder | **Red:** teste criado antes da implementação; falhou pois a função não existia. **Green:** implementação corrigiu a falha. |


## 🤖 Postman Collection

You can explore and test the API endpoints via the shared Postman
workspace:\
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