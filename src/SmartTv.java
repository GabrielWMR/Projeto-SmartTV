public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
    
    public void ligar(){
        ligada=true;
        System.out.println("TV ligada");

    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar Volume " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir volume " + volume);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }
    public void aumentar(){
        canal++;
        System.out.println("o canal atual é: " + canal);
    }

    public void diminuir(){
        canal--;
        System.out.println("o canal atual é: " + canal);
    }
}