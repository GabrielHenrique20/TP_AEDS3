# Trabalho Prático - (AEDs III)

Projeto desenvolvido na disciplina de *Algoritmos e Estruturas de Dados III*.

## 👨‍💻 Integrantes
- Gabriel Henrique Vieira de Oliveira  
- Vinicius Cezar Pereira Menezes  

## 🎓 Professor
- Walisson Ferreira de Carvalho

---

## 📝 Descrição do Projeto

O projeto implementa um **sistema de gerenciamento de viagens**, permitindo o **cadastro, consulta, edição e remoção** de **usuários, viagens, categorias e atividades**.  

Cada entidade possui seu próprio conjunto de dados armazenados em arquivos, e o sistema utiliza **estruturas de dados avançadas** para otimizar o acesso e a busca das informações, como **Árvore B+**.  

A aplicação simula um ambiente de banco de dados simplificado, onde cada registro é controlado e indexado manualmente.

---

## 📁 Estrutura do Projeto
1. O usuário inicia o programa (classe `Principal.java`).  
2. É exibido um menu com opções de gerenciamento (Usuário, Viagem, Categoria, Atividade).  
3. O usuário pode **adicionar**, **editar**, **buscar**, **remover** ou **listar** registros.  
4. As informações são salvas e recuperadas utilizando as estruturas implementadas.

```
├── src/
│ ├── aeds3/ # Estruturas de dados (Árvore B+)
│ ├── controller/ # Menus e controle de navegação
│ ├── dao/ # Classes de persistência (DAO)
│ ├── model/ # Classes de modelo (Usuario, Viagem, Atividade, Categoria)
│ ├── views/ # Classe Principal.java
│ ├── Buscar*.java # Classes de busca de registros
│ └──
```
