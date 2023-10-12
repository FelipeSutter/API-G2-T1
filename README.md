
# Desenvolvimento de API Restful - Academia


Este projeto foi idealizado para um dos Trabalhos do Grupo 2 da disciplina de Desenvolvimento de API Restful, Serratec - 2023.2 - Petrópolis, turma 12.

Neste trabalho, um projeto de API deve ser desenvolvido apresentar, ao menos:

- O modelo físico deverá ser gerado a partir das entidades da API (e não criado direta ente no SGBD) e será composto pelas seguintes entidades:

Instrutor:
----------
- id (serial);
- rg (int8);
- nome (varchar).

Telefone:
--------
- id(serial);
- id_instrutor (serial);
- numero (int8).

Turma:
-----
- id (serial)
- nome_disciplina (varchar)
- dia_semana (varchar)
- id_instrutor (int4).


A respeito das relações entre as entidades, temos: um instrutor só pode ter um telefone e um telefone só pode pertencer a um instrutor; um instrutor pode lecionar em várias turmas e uma turma só pode ter um instrutor.
## Funcionalidades

O projeto foi estruturado em pacotes de Entidades, Respositórios, Serviços e Controles a fim de permitir que as classes sejam acessadas da maneira correta e que as operações CRUD possam funcionar adequadamente.

Na criação do projeto foram utilizadas as configurações recomendadas, com 
- Versão 3.1.4 do Spring Boot; 
- Empacotamento do tipo Jar para o banco de dados; 
- Versão 17 do Java;
- Gerenciador de Dependências Maven; 
Cujas Dependências são:
- Spring Web;
- Spring Boot Dev Tools;
- Spring Data JPA;
- Postgres SQL Driver.
## Ferramentas Utilizadas

- [SpringToolSuite4](https://spring.io/);
- [GitHub](https://www.github.com/);
- [Trello](https://trello.com/);
- [Insomnia 8.0](https://insomnia.rest/);
- [DBeaver 23.2.2](https://dbeaver.io/);
- Java (17).
## Autores

- [GitHub - @Beatriz Barcelos](https://github.com/beabarcel);
- [GitHub - @Bruno Lima](https://www.github.com/brunolimaptr);
- [GitHub - @Emanuel Cardoso](https://www.github.com/ecard58);
- [GitHub - @Felipe Sutter](https://www.github.com/FelipeSutter);
- [GitHub - @Ícaro Nascimento](https://www.github.com/ikaro460);
- [GitHub - @Lucas Latsch](https://www.github.com/lucaslatsch).


