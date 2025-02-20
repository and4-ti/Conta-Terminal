# ContaBanco - Conta Terminal

➥ Este é um projeto em Java que simula características de uma conta em banco com dados de entrada inseridos pelo usuário. O programa solicita algumas informações, realiza validações e imprime os detalhes da conta.

---

## 📌 **Funcionalidades**

**Solicita os seguintes dados do usuário:**
  - **Número da agência**
  - **Número da conta**
  - **Nome completo**
  - **Saldo inicial**
  - Realiza **tratamento de exceções**, garantindo que:
  - O usuário **não possa deixar campos vazios** para agência e nome completo.
  - O usuário **não possa inserir caracteres inválidos** nos campos conta e saldo.
  - Imprime os detalhes da conta após a validação dos dados.

---

## 🚀 **Tecnologias Utilizadas**

  - **Java 11+**
  - **Scanner** para entrada de dados
  - **Tratamento de exceções** (`NumberFormatException` e `InputMismatchException`)

---

## 📂 **Estrutura do Projeto**
    📦 ContaBanco ┣ 📜 src ┃ ┣ 📜 AppBanco.java ┃ ┣ 📜 ContaTerminal.java ┗ 📜 README.md

---

## 🔧 **Como Executar o Projeto**

1. **Clone este repositório:**
    ```bash
    git clone https://github.com/and4-ti/Java-Projects.git
   
2. **Acesse a pasta do projeto:**
    ```bash
    cd ContaBanco

3. **Compile os arquivos Java:**
    ```bash
    javac -d bin src/*.java

4. **Execute o programa:**
    ```bash
    java -cp bin AppBanco
---

## 🖥️ **Exemplo de Entrada e Saída**

**Entrada do Usuário:**
```yaml
Digite o número da agência: 1234
Digite o número da conta: 56789
Digite seu nome completo: João Silva
Informe o valor de saldo: 1500,75
```
**Saída Esperada:**
```makefile
Olá, João Silva! Obrigado por criar uma conta em nosso banco!
Agência: 1234
Conta: 56789
Seu saldo é de R$ 1.500,75 e já está disponível para saque.
```
---
## ⚠️ **Tratamento de Erros**

➥ Se o usuário não inserir a agência ou o nome completo, o programa exibirá um erro e pedirá novamente.
➥ Se o usuário tentar inserir letras em campos numéricos (conta/saldo), o programa exibirá uma mensagem de erro e solicitará a entrada correta.

---

## 🛠 **Autor**
Anderson Oliveira

---

## 📜 **Licença**

Este projeto é de domínio público e pode ser utilizado livremente.

