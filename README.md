# CoinWallet - Backend
Projeto Integrador do Curso de Análise e Desenvolvimento de Sistemas do SENAC.

## Requisitos

- [x] Instalação do Maven
- [x] Instalação do Java 17 ou posterior
- [x] [Criação de um banco de dados SQL](https://github.com/caiohcmattos/coin-wallet-banco)
- [x] Configuração do arquivo application.properties

## Configuração do arquivo application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/coinwallet
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```
Atualizar as informações conforme o banco de dados criado e seu usuário.

## Execução

```bash
mvn spring-boot:run
```

## Próximos passos

- [ ] Implementar novos endpoints
- [ ] Implementar testes unitários
- [ ] Implementar testes de integração
- [ ] Implementar autenticação
- [ ] Implementar autorização
- [ ] Implementar documentação
- [ ] Implementar CI/CD

## Membros do grupo

- [Caio Henrique Campos de Mattos](https://github.com/caiohcmattos)
- [Carlos Augusto Neves dos Santos]()
- [Lucas Gonçalves Leite](https://github.com/luc4sleite)
- [Pedro Henrique Loria Castro]()
- [Ricardo Moreira Faustino](https://github.com/ricfaus)
