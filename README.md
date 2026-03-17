
# BERTOTI REPOSITÓRIO

---

## 📌 Descrição

Este repositório foi criado para compartilhar os projetos desenvolvidos em sala de aula pelos alunos com a ajuda do professor Bertoti.

---

# PROJETO 01

---

# ☕ Coffee API - Spring Boot

## 📌 Descrição

Este projeto consiste no desenvolvimento de uma API REST utilizando **Java com Spring Boot**, com o objetivo de gerenciar cafés através de operações CRUD (Create, Read, Update, Delete).

A aplicação permite cadastrar, consultar, atualizar e remover cafés armazenados em banco de dados.

---

## 🚀 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Maven  
- Banco de Dados (H2 / Oracle)  
- Postman  

---

## 🧠 Arquitetura

A aplicação segue o padrão:

Cliente → API → Banco de Dados

- **Controller** → recebe as requisições HTTP  
- **Repository** → acessa o banco de dados  
- **Model** → representa os dados  

---

## 📂 Estrutura do Projeto

```

src
├── controller
├── model
├── repository
└── CoffeApiApplication.java

````

---

## 📌 Modelo de Dados

### Coffee

```json
{
  "id": "1",
  "name": "Cafe Fatec"
}
````

---

## 🔗 Endpoints da API

### 📋 Listar todos os cafés

* **GET** `/coffees`

![Get funcionando](lab3/projeto1/img/Get.png)

---

### 🔍 Buscar café por ID

* **GET** `/coffees/{id}`

![Get.2 funcionando](lab3/projeto1/img/Get.2.png)

---

### ➕ Criar novo café

* **POST** `/coffees`

```json
{
  "id": "1",
  "name": "Cafe Fatec"
}
```

![Post funcionando](lab3/projeto1/img/Post.png)

---

### ✏️ Atualizar café

* **PUT** `/coffees/{id}`

```json
{
  "name": "Cafe Atualizado"
}
```

![Put funcionando](lab3/projeto1/img/Put.png)


---

### ❌ Remover café

* **DELETE** `/coffees/{id}`

![Delete funcionando](lab3/projeto1/img/Delete.png)

---

## 🧪 Testes

Os testes da API foram realizados utilizando o Postman, validando todas as operações:

* ✔️ Criação de café (POST)
* ✔️ Listagem de cafés (GET)
* ✔️ Busca por ID (GET)
* ✔️ Atualização (PUT)
* ✔️ Remoção (DELETE)

---

## ▶️ Como executar o projeto

1. Abrir o projeto no IntelliJ
2. Executar a classe principal `CoffeApiApplication`
3. A API estará disponível em:

```
http://localhost:8080
```

---

## 🏁 Conclusão

Este projeto permitiu aplicar na prática conceitos de API REST, protocolo HTTP e integração com banco de dados, utilizando o framework Spring Boot.
Também foi possível validar o funcionamento da aplicação através de testes com o Postman.

---



## 👩‍💻 Autora

**Giovanna Marques**
📌 Estudante de Banco de Dados - FATEC


