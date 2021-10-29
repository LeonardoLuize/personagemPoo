package Personagem;

public abstract class Ladrao extends Vilao {

    public Ladrao(){

    }

    @Override
    public void saltar(float z){
        this.posicaoZ = z;
        System.out.printf("\n%s pulando... %f", getClass().getSimpleName(), z);
    };

    @Override
    public void atirar(){
        System.out.printf("\n%s atirando...", getClass().getSimpleName());
    };
}
