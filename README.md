# Exemplos de Testes de Software em Java com JUnit
## Description
Este repositório contém exemplos de testes de software escritos em Java utilizando o framework JUnit. Cada exemplo aborda uma situação prática e ajuda a ilustrar os princípios de desenvolvimento orientado a testes (TDD), além de destacar as boas práticas de testes unitários.

## Tecnologias e Ferramentas
* **Java:** Linguagem de programação para implementação das classes de negócio e testes.
* **JUnit:** Framework de testes para Java que permite a criação de testes unitários, asserções e organização de testes com anotações.


### Capítulo 1: Testes de Unidade

1. **Qual é o objetivo principal dos testes de unidade?**
   - O objetivo dos testes de unidade é verificar a funcionalidade de pequenas partes isoladas do código (geralmente métodos ou funções) para garantir que cada uma delas opere conforme esperado de maneira independente do restante do sistema.

2. **Por que é importante seguir convenções na escrita de testes?**
   - Seguir convenções na escrita de testes melhora a legibilidade e a consistência do código, facilitando a manutenção e colaboração entre desenvolvedores. Além disso, permite que os desenvolvedores entendam rapidamente a estrutura e a intenção dos testes.

3. **O que são classes de equivalência e qual a sua importância em testes?**
   - Classes de equivalência são grupos de dados que representam categorias de entrada semelhantes para um teste. Testar uma entrada de cada classe é geralmente suficiente para verificar o comportamento de um método, reduzindo o número total de testes necessários sem comprometer a eficácia.

4. **Como o uso de @After, @BeforeClass e @AfterClass pode ajudar nos testes?**
   - Essas anotações ajudam a gerenciar o ciclo de vida dos testes. @BeforeClass e @AfterClass executam operações antes e depois de todos os testes, enquanto @After limpa o estado após cada teste, garantindo que cada um seja executado em um ambiente limpo e controlado.

5. **Quais são os benefícios do Test Data Builder em testes de unidade?**
   - O Test Data Builder simplifica a criação de objetos complexos, reduzindo a quantidade de código boilerplate e tornando os testes mais claros e focados na lógica de validação. Isso melhora a legibilidade e facilita a manutenção.

6. **O que significa "100% de cobertura de testes" e por que essa métrica pode ser enganosa?**
   - A cobertura de testes de 100% significa que todas as linhas de código foram executadas ao menos uma vez durante a execução dos testes. No entanto, essa métrica sozinha não garante a qualidade dos testes, pois eles podem não cobrir todos os cenários críticos ou validar adequadamente o comportamento esperado.

### Capítulo 2: Praticando Test-Driven Development (TDD)

1. **Explique o ciclo básico do TDD.**
   - O ciclo do TDD envolve três etapas: *Red* (escrever um teste que falha), *Green* (escrever o código mínimo para passar o teste) e *Refactor* (refatorar o código para melhorá-lo sem quebrar os testes). Esse ciclo é repetido até que todas as funcionalidades sejam implementadas.

2. **Qual é a importância de escrever um teste que falha inicialmente no TDD?**
   - Escrever um teste que falha inicialmente ajuda a garantir que o teste está realmente verificando o comportamento correto. Também serve para identificar o ponto em que o desenvolvimento da funcionalidade deve começar.

3. **Como o TDD influencia o design das classes?**
   - O TDD leva a um design de classes mais modular e coeso, já que escrever testes força os desenvolvedores a criar classes e métodos menores e mais focados, que podem ser testados isoladamente.

4. **Em que circunstâncias o TDD pode não ser viável ou eficiente?**
   - TDD pode não ser eficiente em situações onde o problema é mal definido, onde o tempo é limitado, ou onde a criação de testes seria muito complexa e demorada em comparação ao valor dos mesmos. Também pode ser mais difícil de aplicar em projetos com dependências externas.

5. **Qual é o propósito dos "baby steps" no TDD?**
   - "Baby steps" significa desenvolver o código em pequenos incrementos, criando e testando uma pequena funcionalidade de cada vez. Isso reduz a chance de erros e facilita a identificação de problemas, tornando o processo de desenvolvimento mais controlado.

6. **Por que é recomendado praticar TDD na maior parte do tempo, mas não 100%?**
   - Embora o TDD seja uma prática valiosa, há situações em que seu uso pode ser contraproducente, como para prototipagem rápida, onde mudanças frequentes são esperadas. Nesses casos, o custo de criar e atualizar testes pode superar os benefícios.

7. **Como o TDD pode impactar a produtividade a longo prazo?**
   - O TDD pode reduzir o tempo gasto na depuração e retrabalho ao identificar problemas cedo no processo. Além disso, ele leva a um código mais modular e fácil de manter, o que, a longo prazo, melhora a produtividade e reduz os custos de manutenção.
