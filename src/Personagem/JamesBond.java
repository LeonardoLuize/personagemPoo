package Personagem;

public class JamesBond extends Heroi{

    public JamesBond(int cor){
        super.cor = cor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
