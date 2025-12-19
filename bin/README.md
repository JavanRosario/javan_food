# JavanFood API

API REST desenvolvida em Spring Boot que simula um sistema de delivery de comida, inspirado no iFood.

## 🚀 Sobre o Projeto

JavanFood é uma aplicação backend que gerencia restaurantes, cozinhas, cidades, estados e formas de pagamento. O projeto implementa operações CRUD completas com validações e tratamento de exceções.

## 🛠️ Tecnologias

- **Java 17** - Linguagem principal
- **Spring Boot 3.4.12** - Framework base
- **Spring Data JPA** - Persistência de dados
- **Hibernate** - ORM
- **MySQL 8.0** - Banco de dados
- **Lombok** - Redução de boilerplate
- **Maven** - Gerenciamento de dependências
- **Docker** - Containerização do banco de dados

## 📋 Endpoints Disponíveis

### 🍽️ Restaurantes `/restaurantes`
```
GET    /restaurantes          # Lista todos
GET    /restaurantes/{id}     # Busca por ID
POST   /restaurantes          # Cadastra novo
PUT    /restaurantes/{id}     # Atualização completa
PATCH  /restaurantes/{id}     # Atualização parcial
```
*Inclui associação com cozinha e forma de pagamento*

### 👨‍🍳 Cozinhas `/cozinhas`
```
GET    /cozinhas              # Lista todas
GET    /cozinhas/{id}         # Busca por ID
POST   /cozinhas              # Cadastra nova
PUT    /cozinhas/{id}         # Atualiza
DELETE /cozinhas/{id}         # Remove
```

### 🏙️ Cidades `/cidades`
```
GET    /cidades               # Lista todas
GET    /cidades/{id}          # Busca por ID
POST   /cidades               # Cadastra nova
PUT    /cidades/{id}          # Atualiza
DELETE /cidades/{id}          # Remove
```
*Vinculada a um estado*

### 📍 Estados `/enderecos`
```
GET    /enderecos             # Lista todos
GET    /enderecos/{id}        # Busca por ID
POST   /enderecos             # Cadastra novo
PUT    /enderecos/{id}        # Atualiza
DELETE /enderecos/{id}        # Remove
```

## 🏗️ Arquitetura

```
com.javanfood.javanfood
│
├── 📂 api
│   └── controler/          # Controllers REST (camada de apresentação)
│
├── 📂 domain
│   ├── model/              # Entidades JPA
│   ├── repository/         # Repositories Spring Data
│   ├── service/            # Lógica de negócio
│   └── exeption/           # Exceções customizadas
```

A API estará disponível em `http://localhost:8080`

### 🐳 Docker Compose

O arquivo docker-compose.yml na raiz do projeto configura o MySQL 8.0 com:
- Porta: 3306
- Database: `seu_banco_de_dados`
- Credenciais: root/root
- Volume persistente: `seu_banco_de_dado`

### 📦 Dependências (POM.xml)

- `spring-boot-starter-web` - API REST
- `spring-boot-starter-data-jpa` - Persistência JPA/Hibernate
- `mysql-connector-j` - Driver MySQL
- `lombok` - Redução de boilerplate
- `jackson-dataformat-xml` - Suporte a XML
- `spring-boot-devtools` - Hot reload

---


🚧 **Projeto em Desenvolvimento** 🚧

### Próximas funcionalidades
- Sistema de pedidos
- Autenticação e autorização
- Sistema de avaliações
