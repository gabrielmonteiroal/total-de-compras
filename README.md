# Calculadora de Compras

Este exercício de estrutura condicional simples feito em Java é uma  calculadora de total de compras com base em um código de produto e quantidade desejada.

## Como Usar

1. Certifique-se de ter o Java instalado em seu sistema.
2. Clone este repositório ou baixe o arquivo `Main.java`.
3. Compile o código Java:

   ```bash
   javac Main.java
   ```

4. Execute o programa:

   ```bash
   java Main
   ```

5. Siga as instruções no console:
   - Digite o código do produto (1 a 5).
   - Digite a quantidade desejada.

   O programa calculará o total com base no código inserido e exibirá o resultado.

## Exemplo

```
Digite o código do produto entre 1-5:
3
Digite a quantidade desejada:
2
Total: R$ 10.00
```

## Detalhes do Código

- O programa usa estruturas condicionais `if-else` para determinar o preço com base no código do produto.
- O total é calculado multiplicando a quantidade desejada pelo preço do produto.
- Se um código inválido (fora do intervalo de 1 a 5) for inserido, o programa exibirá uma mensagem de erro e o total permanecerá em 0.0.
