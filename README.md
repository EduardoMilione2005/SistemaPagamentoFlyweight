# Sistema de Pagamento - Padrão Flyweight

## Descrição do Projeto
Este projeto é um exemplo de implementação do **padrão de projeto Flyweight** aplicado a um **Sistema de Pagamento**, desenvolvido em **Java com Maven**.

O objetivo é demonstrar como o padrão Flyweight pode ser utilizado para **reduzir o consumo de memória**, compartilhando objetos que possuem informações em comum.

No contexto deste sistema:

- Os **tipos de pagamento** (`PIX`, `CARTÃO`, `BOLETO`) representam o **estado intrínseco** (compartilhado).
- As **informações da transação** (cliente, valor, pedido) representam o **estado extrínseco** (variável).

Assim, ao invés de criar um novo objeto para cada pagamento, o sistema reutiliza os objetos dos métodos de pagamento já existentes.

---

## Padrão Flyweight

O padrão **Flyweight** pertence à categoria de padrões **estruturais** e tem como objetivo:

- Compartilhar objetos para economizar memória
- Separar estados fixos dos estados variáveis
- Melhorar desempenho em cenários com muitos objetos semelhantes

### Aplicação neste projeto

### Estado Intrínseco (compartilhado)
- Tipo de pagamento
    - PIX
    - CARTÃO
    - BOLETO

### Estado Extrínseco (não compartilhado)
- Nome do cliente
- Valor da transação
- Número do pedido

---

## Estrutura do Projeto

```text
SistemaPagamentoFlyweight/
│── pom.xml
│
└── src/
    ├── main/
    │   └── java/
    │       └── br/com/sistemapagamento/
    │           │── Main.java
    │
    │           ├── flyweight/
    │           │   │── MetodoPagamento.java
    │           │   │── PagamentoPix.java
    │           │   │── PagamentoCartao.java
    │           │   │── PagamentoBoleto.java
    │
    │           ├── factory/
    │           │   │── MetodoPagamentoFactory.java
    │
    │           ├── model/
    │           │   │── Transacao.java
    │
    │           └── service/
    │               │── ProcessadorPagamento.java
    │
    └── test/
        └── java/
            └── br/com/sistemapagamento/
                │── MetodoPagamentoFactoryTest.java
