public class For {
    public static void main(String[] args) throws Exception {

            /*for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos " + carneirinhos);
            }

            System.out.println("Joãozinho dormiu"); */

            //          indices:  0          1       2          3    
            String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

            //  iniando c/ 0  | tamanho array | incremento   
            for (int x = 0; x < alunos.length; x++){

                System.out.println("O aluno no índice" + x + " é " + alunos [x]);
            }

            // declaração da variável aluno que guardará os elementos da lista
            for (String aluno : alunos){

                System.out.println("Nome do aluno é: " + aluno);
            }


         }
}