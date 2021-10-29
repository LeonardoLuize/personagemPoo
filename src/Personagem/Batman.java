package Personagem;

public class Batman extends Heroi implements Camuflagem{

    public Batman(int cor){
        super.cor = cor;
    }

    @Override
    public void camuflar(int cor) {
        System.out.println("\nBatman camuflando...");
    }
}
