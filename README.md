<h1 align="center">🧮 Calculadora com Enum em Java</h1>

<p align="center">
  Projeto Java que utiliza <strong>Enum</strong> e <strong>Lambda Expressions</strong> para implementar
  operações matemáticas de forma organizada, segura e escalável.
</p>

<hr/>

<h2>📌 Sobre o Projeto</h2>

<p>
  Este projeto implementa uma calculadora utilizando a classe
  <code>enum</code> para representar operações matemáticas básicas.
  Cada operação é associada a uma expressão lambda através da interface
  <code>BiFunction</code>, encapsulando a lógica de cálculo dentro do próprio Enum.
</p>

<p>
  Essa abordagem melhora a legibilidade do código, facilita a manutenção
  e segue boas práticas da programação orientada a objetos e funcional em Java.
</p>

<hr/>

<h2>🚀 Funcionalidades</h2>

<ul>
  <li>Soma</li>
  <li>Subtração</li>
  <li>Multiplicação</li>
  <li>Divisão</li>
  <li>Uso de Enum para operações matemáticas</li>
  <li>Uso de Expressões Lambda</li>
</ul>

<hr/>

<h2>🛠️ Tecnologias Utilizadas</h2>

<ul>
  <li>Java 8+</li>
  <li>Enum</li>
  <li>Lambda Expressions</li>
  <li>BiFunction</li>
</ul>

<hr/>

<h2>📂 Estrutura do Enum</h2>

<pre>
<code>
public enum OperationEnum {

    SUN(Integer::sum, "+"),
    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-"),
    MULTIPLY((Integer v1, Integer v2) -> v1 * v2, "*"),
    DIVISION((Integer v1, Integer v2) -> v1 / v2, "/");

    private final BiFunction&lt;Integer, Integer, Integer&gt; calcular;
    private final String symbol;

    OperationEnum(BiFunction&lt;Integer, Integer, Integer&gt; calcular, String symbol) {
        this.calcular = calcular;
        this.symbol = symbol;
    }

    public BiFunction&lt;Integer, Integer, Integer&gt; getCalcular() {
        return calcular;
    }

    public String getSymbol() {
        return symbol;
    }
}
</code>
</pre>

<hr/>

<h2>📖 Como Funciona</h2>

<p>
  Cada constante do <code>OperationEnum</code> representa uma operação matemática
  e contém:
</p>

<ul>
  <li>Uma função de cálculo baseada em <code>BiFunction</code></li>
  <li>Um símbolo que representa a operação matemática</li>
</ul>

<p>
  O método <code>getCalcular()</code> retorna a função responsável pela operação,
  permitindo aplicar o cálculo de forma simples e reutilizável.
</p>

<hr/>

<h2>🧪 Exemplo de Uso</h2>

<pre>
<code>
public class Calculator {

    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 5;

        OperationEnum operation = OperationEnum.SUN;
        int result = operation.getCalcular().apply(v1, v2);

        System.out.println(
            v1 + " " + operation.getSymbol() + " " + v2 + " = " + result
        );
    }
}
</code>
</pre>

<p><strong>Saída esperada:</strong></p>

<pre>
<code>
10 + 5 = 15
</code>
</pre>

<hr/>

<h2>✅ Vantagens do Uso de Enum</h2>

<ul>
  <li>Evita operações inválidas</li>
  <li>Código mais limpo e organizado</li>
  <li>Facilidade para adicionar novas operações</li>
  <li>Centralização da lógica de cálculo</li>
  <li>Melhor manutenção e escalabilidade</li>
</ul>

<p align="center">
  🚀 Desenvolvido para fins de aprendizado em Java
</p>


