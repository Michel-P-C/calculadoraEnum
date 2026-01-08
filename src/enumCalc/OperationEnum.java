package enumCalc;

import java.util.function.BiFunction;

public enum OperationEnum {

    //usando o lambda, e o SUN(INTEGER::SUM) é um replace.
    SUN(Integer::sum,"+"),
    SUBTRACTION((Integer v1, Integer v2) -> v1 - v2, "-" ),
    MULTIPLY((Integer v1, Integer v2) -> v1 * v2, "*" ),
    DIVISION((Integer v1, Integer v2) -> v1 / v2, "/" );

    private final BiFunction<Integer, Integer, Integer> calcular;

    //Símbolos da operações.
    private  final String symbol;

    //construtor da classe enum
    OperationEnum(BiFunction<Integer, Integer, Integer> calcular, String symbol) {
        this.calcular = calcular;
        this.symbol = symbol;
    }

    // o get para ter acesso ao metodo
    public BiFunction<Integer, Integer, Integer> getCalcular(){
        return calcular;
    }
    //o get do symbol
    public String getSymbol(){
        return symbol;
    }
}
