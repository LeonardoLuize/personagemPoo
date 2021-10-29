package Personagem;

public abstract class Heroi extends Personagem {

    public Heroi(){
    }

    @Override
    public void correr(float x, float y){
        this.posicaoX = x;
        this.posicaoY = y;

        System.out.printf("\n%s correndo...", getClass().getSimpleName());
    };

    @Override
    public void saltar(float z){
        this.posicaoZ = z;

        System.out.printf("\n%s saltando... %f", getClass().getSimpleName(), z);
    };

    @Override
    public void atirar(){
        System.out.printf("\n%s atirando...", getClass().getSimpleName());
    };


}
