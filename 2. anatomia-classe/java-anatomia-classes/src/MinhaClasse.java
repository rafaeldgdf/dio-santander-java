public class MinhaClasse {

public static void main (String [] args){ //metodo principal
    
    String primeiroNome = "Rafael";
    String segundoNome = "Vitor";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
}

public static String nomeCompleto(String primeiroNome, String segundoNome){ //método/função
    return "Resultado do método: " +  primeiroNome.concat(" ").concat(segundoNome);
}



}
