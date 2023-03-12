public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Volume começa em: " + smartTv.volume);
        // só para entender em que volume a tv vai iniciar
        smartTv.deminuirVolume();
        smartTv.deminuirVolume();
        smartTv.deminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();

        System.out.println("2o status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("3o status -> Tv Ligada? " + smartTv.ligada);

    }
}
