public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       
        byte idade = 123; // Fora do intervalo permitido para byte
        short ano = 2021; //até 32.0000 
        int cep = 21070333; // se começar com zero, talvez tenha que alterar
        long cpf = 98765432109L; // se começar com zero, talvez tenha que alterar 
        float pi = 3.14F;
        double salario = 1275.33;
        String nome1 = "João Silva"; // Declara uma variável 'nome' do tipo String e atribui o valor "João Silva"

        //A partir do Java 10, é possível declarar variáveis sem especificar explicitamente 
        //o tipo de dado, utilizando a palavra-chave var: 
        var nome = "Maria"; // A variável 'nome' é inferida como String
        var preco = 19.99; // A variável 'preco' é inferida como double

        // Mostrar os valores na tela
            System.out.println("Idade: " + idade);
            System.out.println("Ano: " + ano);
            System.out.println("CEP: " + cep);
            System.out.println("CPF: " + cpf);
            System.out.println("Pi: " + pi);
            System.out.println("Salário: " + salario);


        // const = variáveis imutáveis 

        final double VALOR_DE_PI = 3.14; //para declarar uma constante, basta colocar final antes da declaração e, 
                                         // por convenção, o nome deve estar em CAIXA ALTA.
    }


}
