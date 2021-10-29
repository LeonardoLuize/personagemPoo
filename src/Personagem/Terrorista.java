package Personagem;

public abstract class Terrorista extends Vilao{

    public Terrorista(){
    }

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
