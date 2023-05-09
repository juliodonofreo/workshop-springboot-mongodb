# Projeto web services com Spring Boot e JPA / Hibernate

## Sobre o projeto
Projeto meramente acadêmico de criação de uma api RestFul utilizando SpringBoot como framework, o projeto consiste num crud utilizando o banco de dados orientado a documentos
"mongodb", portanto, diferentemente do meu projeto anterior com mysql este não possurá relacionamentos entre entidades porque tudo é feito através de documentos "JSON".
O banco é composto por dois documentos "User" e "Post", os posts de um usuário são apenas uma referência, já os comentários de um post estão anexados no documento em si.
O projeto foi desenvolvido no curso da udemy "Java COMPLETO 2023 Programação Orientada a Objetos + Projetos" do professor nelio alves.


## Objetivos
1. Criar projeto Spring Boot Java;
2. Estruturar camadas lógicas: resource, service, repository;
3. Configurar banco de dados orientado a documentos "mongodb";
4. Povoar o banco de dados;
5. CRUD - Create, Retrieve, Update, Delete;
6. Tratamento de exceções.

## Tecnologias utilizadas
1. Spring boot;
2. Springtoolsuite4;
3. mongoDb;
4. Apache maven
5. mongoCompass (para testes no banco de dados)
6. Postman (para testes na aplicação)
