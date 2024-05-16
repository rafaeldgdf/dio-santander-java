import java.util.Random; // classe para gerar numeros aleatorios 

public class While {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            // Comentário: Verifica se o valor do doce é maior que a mesada restante
            // Se for, ajusta o valor do doce para o valor máximo da mesada
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho!");
            mesada -= valorDoce; //comando para subtrair o valor do doce da mesada 
            // poderia ser mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces!");
    }

    private static double valorAleatorio() {
        Random random = new Random();
        return random.nextDouble() * 6 + 2;
    }
}