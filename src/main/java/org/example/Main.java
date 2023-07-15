package org.example;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcularFatorial(6));
    }

    /**
     * optei por utilizar metodos da classe BigInteger
     * primeiro crio um BigInteger com valor inicial de 1
     * após isso, um for, que, inicia com 2 e continua até i ser menor ou igual ao parametro numero
     * e a cada loop multiplica a variável fatorial pelo valor de i.
     * acabando o for, ele retorna o valor
     */
    public static BigInteger calcularFatorial(int numero) {
        BigInteger fatorial = BigInteger.ONE;

        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        return fatorial;
    }

}