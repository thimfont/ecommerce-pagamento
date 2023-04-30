# pagamento
Serviço responsável por gerar um pedido. A interação com o serviço se dá através de uma **api-rest** e via **mensageria via evento** (_implementação futura_) 


_**obs**: por fazer parte de um estudo de arquitetura de microserviços este projeto é bem simples. Ele também compoem um sistema ainda mais simples de e-commerce._

<br>

# api

## Pagamentos

| METODO | ENDPOINT | AÇÃO |
| --- | --- | --- |
| `GET` |`/pagamentos` | lista todos os pagamentos |
| `GET` |`/pagamentos/:id` | busca pagamento |
| `POST` |`/pagamentos` | adiciona novo pagamento |

<br>

# Setup
Ao clonar o projeto, navegue até a pasta raiz para relizar os comandos a seguir:

## resolver dependências

``` 
mvn install 
```

## boot app

``` 
mvn spring-boot:run 
```

<br>

# Tecnologia
* java
* Spring-boot
* Maven
