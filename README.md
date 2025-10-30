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

---

## 📁 Estrutura do Projeto
1. O usuário inicia o programa (classe `Principal.java`).  
2. É exibido um menu com opções de gerenciamento (Usuário, Viagem, Categoria, Atividade).  
3. O usuário pode **adicionar**, **editar**, **buscar**, **remover** ou **listar** registros.  
4. As informações são salvas e recuperadas utilizando as estruturas implementadas.

```
├── src/
│ ├── aeds3/ # Estruturas de dados (Árvore B+ e a classe importante,ParIntInt)
│ ├── controller/ # Menus e controle de navegação
│ ├── dao/ # Classes de persistência (DAO)
│ ├── model/ # Classes de modelo (Usuario, Viagem, Atividade, Categoria)
│ ├── views/ # Classe Principal.java
│ ├── Buscar*.java # Classes de busca de registros
│ └──
```
---

## 🚀 Como Executar

### 🧩 Usando uma IDE (recomendado)

1. **Abra o projeto** em uma IDE Java (Eclipse ou VS Code com extensão Java).  
2. **Baixe e instale** o JDK no seu computador
3. **Compile** o projeto.  
4. **Execute** a classe principal:

```
src/views/Principal.java
```

4. Siga as instruções exibidas no menu principal do programa.

---

## ⚙️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos  
- **Arquitetura:** MVC (Model-View-Controller) e DAO.
- **Estruturas de dados implementadas:**
- Árvore B+  
- ParIntInt

Essas estruturas são utilizadas para otimizar o armazenamento e busca dos registros do sistema (usuários, viagens, atividades, categorias).

---

## 👌 Funcionalidades

- Cadastro, listagem, edição, remoção e relação de:
```
- Usuários  
- Viagens  
- Categorias  
- Atividades  
```

- Relacionamentos 1:N entre entidades (por exemplo: usuários e viagens, categorias e atividades).  
- Utilização de estruturas de dados avançadas para indexação e busca eficiente.  

---

## 📚 Organização

- O pacote `aeds3` contém as estruturas de dados implementadas pelo professor Kutova.
- O pacote `controller` contém os menus e opções de interação com o usuário.
- O pacote `dao` realiza a comunicação entre os modelos e os arquivos de dados.
- O pacote `model` constitui-se das classes das entidades e seus respectivos registros.
- O pacore `views` contém a presença da classe Principal do código.
- As 4 classes `Buscar`. são responsáveis pela busca dos registros existentes.

---

## 🧠 Objetivo do Trabalho

Implementar uma aplicação em Java que utilize **estruturas de dados complexas** (Árvore B+) para gerenciar registros de forma eficiente, simulando um sistema de viagens.

---

## 📄 Informações

Para uso acadêmico. Trabalho prático desenvolvido para fins educacionais na disciplina de **Algoritmos e Estruturas de Dados III**, pela PUC MINAS Coração Eucarístico.

Outras informações, como implementações, estruturas e lógica do código, estão respondidas e presentes no PDF de respostas elaborado pelo professor Walisson Ferreira de Carvalho, na pasta Parte 2.














