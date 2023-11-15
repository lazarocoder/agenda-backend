# Agenda-backend

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (versão 8 ou superior)
- [Maven](https://maven.apache.org/download.cgi)

## Configuração do Banco de Dados

1. Instale um banco de dados compatível (por exemplo, MySQL, PostgreSQL).
2. Crie um banco de dados vazio.
3. Atualize as configurações de banco de dados no arquivo `src/main/resources/application.properties` com as informações do seu banco de dados.

## Como Executar

Siga estas etapas para executar localmente o seu projeto:

4. Clone este repositório:

- [Bash]

```bash
  git clone https://github.com/lazarocoder/agenda-backend.git
```

- Navegue até o diretório do projeto:

```bash
    cd agenda-backend
```
- [Maven]
```bash
2. mvn build
3. mvn clean
4. mvn install
5. mvn spring-boot:run
```
