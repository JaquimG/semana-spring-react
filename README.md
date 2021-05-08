# Semana-spring-react
Aprimorando os conhecimentos de spring e aprendendo sobre react com um sistema básico de vendas.

# Comandos simples úteis para reproduzir alguns tópicos

## Criando um projeto react

Para criar um projeto reactjs, pode-se utilizar o comando: npx create-react-app <nome_do_projeto> --template typescript

## Adicionando bootstrap

Caso queira adicionar o bootstrap ao projeto, use: yarn add bootstrap

## Adicionando Apex Charts

Caso queira adicionar Apex Charts, use: yarn add apexcharts && yarn add react-apexcharts

## Fazendo deploy no heroku

Caso queira fazer deploy e possua o heroku cli, use:

'''
heroku -v
heroku login
heroku git:remote -a <nome-do-app>
git remote -v
git subtree push --prefix backend heroku main
'''
