
# 🍣 Sistema de Pedido e Classificação de Restaurante

Projeto desenvolvido em **Java** como atividade prática durante o curso Técnico em Desenvolvimento de Sistemas do IFSul.

O programa simula o registro de um pedido em um restaurante, calculando o valor total da conta e classificando o perfil do cliente de acordo com os produtos escolhidos.

## 📋 Sobre o projeto

O sistema permite informar a quantidade consumida de diferentes produtos e, a partir dessas informações, calcula automaticamente o valor de cada item e o total da conta.

Além disso, o programa apresenta os produtos consumidos e classifica o cliente em diferentes perfis com base nas escolhas realizadas.

## 🍣 Produtos disponíveis

| Produto | Preço |
|---|---:|
| Hot | R$ 12,00 |
| Yakisoba | R$ 18,00 |
| Sashimi | R$ 15,00 |
| Temaki | R$ 14,00 |
| Uramaki | R$ 13,00 |

## 🎯 Funcionalidades

- Registro da quantidade de cada produto consumido;
- Cálculo do valor individual de cada item;
- Cálculo do valor total da conta;
- Exibição do resumo do pedido;
- Identificação dos produtos consumidos;
- Classificação do perfil do cliente;
- Exibição dos resultados diretamente no terminal.

## 👤 Classificação do cliente

O programa utiliza as escolhas do cliente para determinar um perfil:

### 🟢 Cauteloso

Cliente que consumiu apenas **Hot e/ou Yakisoba**.

### 🔵 Aventureiro

Cliente que consumiu **Sashimi, Temaki ou Uramaki**.

### ⚪ Nem comeu

Cliente que não consumiu nenhum dos produtos.

## 🛠️ Tecnologias e conceitos utilizados

- **Java**
- `Scanner`
- Variáveis `int`, `double` e `String`
- Operadores matemáticos
- Estruturas condicionais (`if`, `else if` e `else`)
- Operadores lógicos (`&&` e `||`)
- Entrada de dados pelo terminal
- Cálculo e processamento de informações
- Lógica de programação

## 📌 Exemplo de funcionamento

O usuário informa a quantidade consumida de cada produto:

```text
Quantidade de Hot: 2
Quantidade de Yakisoba: 1
Quantidade de Sashimi: 0
Quantidade de Temaki: 0
Quantidade de Uramaki: 0
````

O programa calcula os valores:

```text
--- Resumo da conta ---
Hot: 2 x R$ 12,00 = R$ 24,00
Yakisoba: 1 x R$ 18,00 = R$ 18,00
Sashimi: 0 x R$ 15,00 = R$ 0,00
Temaki: 0 x R$ 14,00 = R$ 0,00
Uramaki: 0 x R$ 13,00 = R$ 0,00
Total: R$ 42,00
```

E classifica o cliente:

```text
Perfil: Cauteloso
```

## 🎓 Objetivo

O objetivo deste projeto foi praticar conceitos fundamentais de programação em Java, especialmente:

* Entrada e processamento de dados;
* Operações matemáticas;
* Estruturas condicionais;
* Operadores lógicos;
* Manipulação de variáveis;
* Desenvolvimento de regras de negócio;
* Exibição de informações no terminal;
* Lógica de programação.

## 👨‍💻 Autor

**Nícolas Maciel Lemos Batista**

Estudante do Técnico em Desenvolvimento de Sistemas — IFSul
