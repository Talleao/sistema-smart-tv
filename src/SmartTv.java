public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;

  }

  public void aumentarCanal() {
    canal++;

  }

  public void diminuirCanal() {
    canal--;

  }

  public void aumentarVolume() {
    volume++;
    // volume = volume + 1;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void deminuirVolume() {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);

  }

  public void ligar() {
    ligada = true;
    System.out.println("Lingando a Tv. Olá! ");

  }

  public void desligar() {
    System.out.println("Desligando a Tv. Até daqui a pouco!");
    ligada = false;

  }

}
