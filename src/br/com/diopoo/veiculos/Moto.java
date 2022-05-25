package br.com.diopoo.veiculos;

public class Moto extends Veiculo{
    int cilindrada;

    public Moto() {
        super();
    }

    public Moto(String marca,String modelo,String cor,String combustivel, int ano, int tamanhoTanque, int cilindrada) {
        super(marca, modelo, cor, combustivel, ano, tamanhoTanque);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
