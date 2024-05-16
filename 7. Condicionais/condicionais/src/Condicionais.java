public class Condicionais {
    public static void main(String[] args) throws Exception {
        double nota = 10;

        if (nota >= 7) {
            System.out.println("Aprovado.");
        } else if (nota >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

         //                                     se não  
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado"; // condição ternária
        System.out.println(resultado);

        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }

}
