# Semana-spring-react
Aprimorando os conhecimentos de spring e aprendendo sobre react com um sistema básico de vendas.

# Comandos simples úteis para reproduzir alguns tópicos

## Criando um projeto react

Para criar um projeto reactjs, pode-se utilizar o comando: npx create-react-app <nome_do_projeto> --template typescript

## Adicionando bootstrap

Caso queira adicionar o bootstrap ao projeto, use: yarn add bootstrap

## Adicionando Apex Charts

Caso queira adicionar Apex Charts, use: yarn add apexcharts && yarn add react-apexcharts

## Trabalhando com rotas

Para criar rotas em seu projeto react, primeiramente adicione o router-dom com os comandos: yarn add react-router-dom && yarn add @types/react-router-dom -D

## Realizando requisições HTTP

Para realizar as requisições HTTP, utilize: yarn add axios

## Fazendo deploy no heroku

Caso queira fazer deploy e possua o heroku cli, use:

heroku -v
heroku login
heroku git:remote -a <nome-do-app>
git remote -v
git subtree push --prefix <nome_do_projeto> heroku main
  
Vale lembrar que, para esses comandos, o proejeto deverá estar no github
