package Personagem;

public class Goldfinger extends Terrorista implements Personificacao{

    public Goldfinger(int cor){
        super.cor = cor;
    }


    @Override
    public void camuflar(int cor) {
        System.out.println("\nGoldfinger camuflando...");
    }

    @Override
    public void personificar(Heroi h) {
        System.out.printf("\nGoldfinger camuflando %s", h);
    }
}
