# Conta Terminal

➥ Este projeto em Java simula a criação e exibição de informações de uma conta bancária por meio do terminal.

---

## 🚀 **Tecnologias Utilizadas**

  - **Java**
  - **Tratamento de exceções unchecked e personalizada** (`NumberFormatException` e), (`QuantidadeDigitosException` e)
  - **Scanner** para entrada de dados
  - **Expressões Regulares** para validação de entrada
  - **NumberFormat** para formatação de valores monetários
  - **Locale** para suporte a internacionalização

---

## 📌 **Funcionalidades**

**Solicitação e validação de informações da conta bancária:**
  - **Número da agência** (com dígito, sem separação, mínimo 4 dígitos)
  - **Número da conta** (com dígito, sem separação, mínimo 4 dígitos)
  - **Nome do cliente** (aceita espaços e caracteres acentuados, mínimo 3 caracteres)
  - **Saldo inicial da conta** (aceita números inteiros ou decimais com separação por ponto)
  - Tratamento de exceções personalizadas para validação dos campos
  - Exibição formatada dos dados da conta

---

## ⚠️ **Tratamento de Erros**

➥ O código implementa um sistema robusto de tratamento de erros para garantir a integridade dos dados inseridos pelo usuário:

- Exceção Personalizada (QuantidadeDigitosException): Lançada quando a agência ou número da conta não seguem o formato esperado (mínimo de 4 dígitos sem separação).

- NumberFormatException: Capturada quando o usuário insere um saldo inválido (não numérico ou com formatação incorreta).

- Validações com Expressões Regulares: Utilizadas para garantir que o nome do cliente contenha apenas letras (incluindo acentos), espaços, apóstrofos e hifens.

➥ Sempre que ocorre um erro, o programa exibe uma mensagem clara ao usuário e solicita a correção do dado inserido.

---

## 📝 Formatação e Validações ✔️

- A formatação do saldo utiliza `NumberFormat` para exibir valores monetários no formato brasileiro (R\$).
- A validação de nome permite letras, espaços, apóstrofos e hifens, garantindo suporte a nomes com acentos.
- A agência e a conta são verificadas para garantir que contenham apenas números e tenham pelo menos 4 dígitos.

---

## 📂 **Estrutura do Código**
    📦 ContaBanco ┣ 📜 src ┃ ┣ 📜 AppBanco.java ┃ ┣ 📜 ContaTerminal.java ┃ ┣ 📜 QuantidadeNumerosException ┗ 📜 README.md



- `ContaTerminal`: Classe principal responsável pela criação da conta, validação de dados e exibição das informações formatadas.

- `AppBanco`: Classe principal que inicializa a aplicação e instancia a conta bancária.

- `QuantidadeDigitosException`: Exceção personalizada para validação de entrada de números.

---

## 🔧 **Como Executar**

1. **Clone este repositório:**
    ```sh
    git clone https://github.com/and4-ti/Java-Projects.git
    ```
   
2. **Acesse a pasta do projeto:**
    ```sh
    cd ContaBanco
    ```

3. **Compile os arquivos Java:**
    ```sh
    javac -d bin src/*.java
    ```

4. **Execute o programa:**
    ```sh
    java -cp bin AppBanco
    ```
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
Agência: 123-4
Conta: 5678-9
Seu saldo é de R$ 1.500,75 e já está disponível para saque.
```
---

## 🛠 **Autor**
Anderson Oliveira

---

## 📜 **Licença**

➥ Este projeto foi desenvolvido para fins de aprendizado em Java e boas práticas de programação. É um projeto de domínio público e pode ser utilizado livremente.

