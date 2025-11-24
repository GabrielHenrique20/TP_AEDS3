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

Com as atualizações mais recentes, o sistema passou a suportar:

- Um **relacionamento N:N entre Viagem e Atividade**, permitindo vincular múltiplas atividades a diferentes viagens, com controle de **status, prioridade e listagens bidirecionais**.
- Um módulo de **backup e compactação** dos dados, utilizando algoritmos de **Huffman** e **LZW**, apoiados pela classe `VetorDeBits` e pela classe `Backup`.
- Um mecanismo de **criptografia RSA** aplicado automaticamente ao campo **e-mail** da entidade `Usuario`, garantindo maior segurança de dados sensíveis.

---

## 📁 Estrutura do Projeto
1. O usuário inicia o programa (classe `Principal.java`).  
2. É exibido um menu com opções de gerenciamento:
   - Usuário  
   - Viagem  
   - Categoria  
   - Atividade  
   - Vínculos Viagem–Atividade (N:N)  
   - **Backup / Compactação** (gera e restaura backups comprimidos)
3. O usuário pode **adicionar**, **editar**, **buscar**, **remover**, **listar**, **vincular** registros e **realizar backups compactados**.  
4. Os dados são persistidos em arquivos binários, utilizando **cabeçalho e lápide** para controle de integridade.

```
├── SistemaViagens/
│   ├── src/
│   │   ├── aeds3/          # Estruturas de dados (Árvore B+, ParIntInt)
│   │   ├── compactacao/    # Algoritmos de compactação (Huffman, LZW, classe Backup e Vetor de Bits)
│   │   ├── controller/     # Menus e controle de navegação
│   │   ├── criptografia/   # Implementação do RSA e manipulação de chaves
│   │   ├── dao/            # Classes de persistência (DAO e índices B+)
│   │   ├── model/          # Classes de modelo (Usuario, Viagem, Atividade, Categoria, RelViagemAtividade)
│   │   ├── views/          # Classe Principal.java (ponto de entrada)
│   │   └── Buscar*.java    # Classes auxiliares de busca
│   └── dados/              # Arquivos de dados e arquivos de backup gerados na execução

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
# **Estruturas de dados implementadas:**
- Árvore B+  
- ParIntInt
# **Algoritmos de compactação:**
- Huffman
- LZW
- VetorDeBits
- Classe Backup para criação e restauração de backups compactados
# **Criptografia:**
- RSA aplicado ao campo e-mail do Usuario
- E-mail armazenado cifrado em arquivo e decifrado ao exibir os dados no CRUD
- **Persistência:** Arquivos binários com cabeçalho (controle do último ID) e lápide (exclusão lógica)
# **Relacionamentos:** 
- 1:N (Usuário–Viagem, Categoria–Atividade)
- N:N (Viagem–Atividade) com controle dos índices B+ e atributos adicionais (status e prioridade).

---

## 👌 Funcionalidades

- Cadastro, listagem, edição, remoção e vínculo de:
```
- Usuários
- Viagens
- Categorias
- Atividades
- Relações Viagem–Atividade (N:N)
- Compactação/Dewcompactação
```
# **Relacionamentos:**  
- 1:N e N:N com integridade referencial manual (remoção em cascata).
- Índices B+ para busca eficiente.
- Atualização de status e prioridade nos vínculos.

# **Backup e Compactação:**
- Geração de backups compactados dos arquivos de dados usando Huffman ou LZW.
- Manipulação de bits via VetorDeBits durante compressão e descompressão.
- Restauração dos dados a partir dos arquivos de backup.

# **Criptografia:**
- Criptografia RSA aplicada ao e-mail do usuário.
- Armazenamento seguro do e-mail em disco.
- Descriptografia transparente ao consultar ou listar usuários.
---

## 📚 Organização

- O pacote `aeds3` contém as estruturas de dados implementadas pelo professor Kutova.
- O pacote `compactacao` implementa os algoritmos de compactação (Huffman, LZW, Backup e VetorDeBits).
- O pacote `controller` contém os menus e lógica de navegação do sistema.
- O pacote `criptografia` implementa a criptografia RSA e manipulação de chaves.
- O pacote `dao` realiza a persistência e controle dos arquivos de dados (com índices B+).
- O pacote `model` constitui-se das Entidades principais e tabela intermediária (RelViagemAtividade).
- O pacore `views` contém classe Principal.java (ponto de entrada da aplicação).
- As 4 classes `Buscar`. são responsáveis pela busca dos registros existentes.

---

## 🧠 Objetivo do Trabalho

Implementar uma aplicação em Java que utilize estruturas de dados complexas (Árvore B+), algoritmos de compactação (Huffman, LZW) e criptografia RSA para gerenciar registros e relacionamentos entre entidades, simulando um sistema de viagens completo, eficiente e com foco em armazenamento, desempenho e segurança.

---

## 📄 Informações

Projeto acadêmico desenvolvido para a disciplina Algoritmos e Estruturas de Dados III – PUC Minas Coração Eucarístico.















