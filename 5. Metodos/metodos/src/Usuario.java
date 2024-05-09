public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(); //orientação a objeto 

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar(); //metodo ligar
        System.out.println("Novo status:" );
        System.out.println("Tv ligada? " + smartTv.ligada);
    

        smartTv.desligar(); //metodo desligar
        System.out.println("Novo status:" );
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume(); //metodo aumentar volume 
        smartTv.aumentarVolume(); 
        smartTv.aumentarVolume(); 
        System.out.println("Novo status:" );
        System.out.println("Volume: " + smartTv.volume);
        smartTv.diminuirVolume(); 
        System.out.println("Novo status:" );
        System.out.println("Volume: " + smartTv.volume);


        smartTv.diminuirVolume(); //metodo diminuir volume 

        smartTv.mudarCanal(13);
        System.out.println("Novo status:" );
        System.out.println("Canal: " + smartTv.canal);






    ;




    }
}
