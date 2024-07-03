# PawHearts

PawHearts é um sistema de adoção de animais desenvolvido com Spring Boot no back-end e Angular no front-end.

## Pré-requisitos

- [Java 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Node.js e npm](https://nodejs.org/en/download/)
- [Angular CLI](https://angular.io/cli)

## Configuração e Execução

### Back-end

1. Navegue até a pasta `backend`:
    ```bash
    cd backend
    ```

2. Instale as dependências e inicie o servidor:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

3. O servidor estará rodando em `http://localhost:8080`.

### Front-end

1. Navegue até a pasta `frontend/PawHeartsFront`:
    ```bash
    cd frontend/PawHeartsFront
    ```

2. Instale as dependências:
    ```bash
    npm install
    ```

3. Inicie o servidor de desenvolvimento:
    ```bash
    ng serve
    ```

4. Abra o navegador e acesse `http://localhost:4200`.

## Funcionalidades

- **Página Inicial**: Navegação para várias seções (Registro de Usuário, Cadastro de Animais, Pesquisa de Animais).
- **Registro de Usuário**: Formulário para registrar usuários.
- **Cadastro de Animais**: Formulário para cadastrar animais para adoção e animais perdidos.
- **Pesquisa de Animais**: Página para pesquisa e visualização de animais disponíveis para adoção e perdidos.