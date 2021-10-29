package Personagem;

public abstract class Vilao extends Personagem{

    public Vilao(){
    }

    @Override
    public void correr(float x, float y){
        this.posicaoX = x;
        this.posicaoY = y;

        System.out.printf("%s correndo...", getClass().getSimpleName());
    };

}
