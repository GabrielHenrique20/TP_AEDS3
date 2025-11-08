# Trabalho Prático - (AEDs III)

Projeto desenvolvido na disciplina de *Algoritmos e Estruturas de Dados III*.

## 👨‍💻 Integrantes
- Gabriel Henrique Vieira de Oliveira  
- Vinicius Cezar Pereira Menezes  

## 🎓 Professor
- Walisson Ferreira de Carvalho

---

## 📝 Descrição do Projeto

O projeto implementa um **sistema de gerenciamento de viagens**, permitindo o **cadastro, consulta, edição e remoção** de **usuários, viagens, categorias e atividades**, além de relacionamentos entre essas entidades.  

Cada entidade possui seu próprio conjunto de dados armazenados em arquivos, e o sistema utiliza **estruturas de dados avançadas** para otimizar o acesso e a busca das informações, como **Árvore B+**.

A partir das atualizações mais recentes, o sistema passou a suportar um relacionamento N:N entre Viagem e Atividade, permitindo vincular múltiplas atividades a diferentes viagens, com controle de **status, prioridade, e listagens bidirecionais**.

---

## 📁 Estrutura do Projeto
1. O usuário inicia o programa (classe `Principal.java`).  
2. É exibido um menu com opções de gerenciamento (Usuário, Viagem, Categoria, Atividade e Vínculos Viagem–Atividade (N:N)).  
3. O usuário pode **adicionar**, **editar**, **buscar**, **remover** ou **listar** registros.  
4. Os dados são persistidos em arquivos binários, utilizando cabeçalho e lápide para controle de integridade..

```
├── SistemaViagens/
│   ├── src/
│   │   ├── aeds3/          # Estruturas de dados (Árvore B+ e ParIntInt)
│   │   ├── controller/     # Menus e controle de navegação
│   │   ├── dao/            # Classes de persistência (DAO)
│   │   ├── model/          # Classes de modelo (Usuario, Viagem, Atividade, Categoria, RelViagemAtividade)
│   │   ├── views/          # Classe Principal.java
│   │   └── Buscar*.java    # Classes auxiliares de busca
│   └── dados/              # Arquivos de dados gerados durante a execução

```
---

## 🚀 Como Executar

### 🪟 **Ambiente Windows (recomendado)**

1. **Instale o JDK** (Java Development Kit).  
2. **Abra o projeto em uma IDE Java**, como VS Code (com a extensão Java) ou Eclipse.
3. **Compile o projeto** e execute a classe principal:

```
src/views/Principal.java
```
4. O menu principal será exibido no console. Basta seguir as opções para gerenciar os registros.

---

### 🐧 **Ambiente Linux**

1. Abra o terminal na pasta raiz do projeto **(onde estão as pastas dados/ e SistemaViagens/)**.
2. Navegue até o diretório de código-fonte:

```
cd SistemaViagens/src
```

3. Compile o código-fonte:

```
javac views/Principal.java
```

4. Execute a aplicação:

```
java views.Principal
```
O menu principal será exibido no terminal, permitindo todas as operações CRUD e o gerenciamento dos vínculos N:N entre viagens e atividades.

---

## ⚙️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos  
- **Arquitetura:** MVC (Model-View-Controller) e DAO.
- **Estruturas de dados implementadas:**
- Árvore B+  
- ParIntInt
- **Persistência:** arquivos binários com cabeçalho e lápide
- **Relacionamentos:** 1:N (Usuário–Viagem, Categoria–Atividade) e N:N (Viagem–Atividade) com controle de unicidade, índices B+, e atributos adicionais (status e prioridade)

---

## 👌 Funcionalidades

- Cadastro, listagem, edição, remoção e vínculo de:
```
- Usuários
- Viagens
- Categorias
- Atividades
- Relações Viagem–Atividade (N:N)
```
# **Relacionamentos:**  
- 1:N e N:N com integridade referencial manual (remoção em cascata)
- Índices B+ bidirecionais para busca eficiente
- Atualização de status e prioridade nos vínculos

---

## 📚 Organização

- O pacote `aeds3` contém as estruturas de dados implementadas pelo professor Kutova.
- O pacote `controller` contém os Menus e lógica de navegação do sistema.
- O pacote `dao` realiza a persistência e controle dos arquivos de dados (com índices B+).
- O pacote `model` constitui-se das Entidades principais e tabela intermediária (RelViagemAtividade).
- O pacore `views` contém classe Principal.java (ponto de entrada da aplicação).
- As 4 classes `Buscar`. são responsáveis pela busca dos registros existentes.

---

## 🧠 Objetivo do Trabalho

Implementar uma aplicação em Java que utilize estruturas de dados complexas (Árvore B+) para gerenciar registros e relacionamentos entre entidades, simulando um sistema de viagens completo e eficiente.

---

## 📄 Informações

Projeto acadêmico desenvolvido para a disciplina Algoritmos e Estruturas de Dados III – PUC Minas Coração Eucarístico.















