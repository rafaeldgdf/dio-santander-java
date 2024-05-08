public class Operadores {

    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b; // Soma
        int subtracao = a - b; // Subtração
        int multiplicacao = a * b; // Multiplicação
        int divisao = a / b; // Divisão
        int resto = a % b; // Resto da divisão

        // Imprimir resultados dos operadores aritméticos
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);

        // Operadores de atribuição
        int c = 10;
        c += 5; // c = c + 5;
        c -= 3; // c = c - 3;
        c *= 2; // c = c * 2;
        c /= 4; // c = c / 4;
        c %= 3; // c = c % 3;

        // Imprimir resultado do operador de atribuição
        System.out.println("Resultado do operador de atribuição: " + c);

        // Operadores de incremento e decremento
        int d = 5;
        d++; // Incremento de 1
        d--; // Decremento de 1

        // Imprimir resultado dos operadores de incremento e decremento
        System.out.println("Resultado do incremento: " + d);
        System.out.println("Resultado do decremento: " + d);

        // Operadores de comparação
        boolean igual = a == b; // Igualdade
        boolean diferente = a != b; // Diferença
        boolean maior = a > b; // Maior que
        boolean menor = a < b; // Menor que
        boolean maiorOuIgual = a >= b; // Maior ou igual a
        boolean menorOuIgual = a <= b; // Menor ou igual a

        // Imprimir resultados dos operadores de comparação
        System.out.println("Igualdade: " + igual);
        System.out.println("Diferença: " + diferente);
        System.out.println("Maior que: " + maior);
        System.out.println("Menor que: " + menor);
        System.out.println("Maior ou igual a: " + maiorOuIgual);
        System.out.println("Menor ou igual a: " + menorOuIgual);

        // Operadores lógicos
        boolean and = (a > 0) && (b < 10); // AND lógico
        boolean or = (a > 0) || (b < 10); // OR lógico
        boolean not = !(a == b); // NOT lógico

        // Imprimir resultados dos operadores lógicos
        System.out.println("AND lógico: " + and);
        System.out.println("OR lógico: " + or);
        System.out.println("NOT lógico: " + not);

        // Operador condicional (ternário)
        int resultadoTernario = (a > b) ? a : b; // Se a > b, então resultadoTernario = a, senão resultadoTernario = b

        // Imprimir resultado do operador condicional
        System.out.println("Resultado do operador condicional: " + resultadoTernario);
    }
}
