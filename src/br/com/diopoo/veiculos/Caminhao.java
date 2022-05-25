package br.com.diopoo.veiculos;

public class Caminhao extends Veiculo{
    String tipo, direcao, suspensao;

    public Caminhao() {
        super();
    }

    public Caminhao(String marca,String modelo,String cor,String combustivel, int ano, int tamanhoTanque, String tipo
            , String direcao, String suspensao) {
        super(marca, modelo, cor, combustivel, ano, tamanhoTanque);
        this.tipo = tipo;
        this.direcao = direcao;
        this.suspensao = suspensao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }
}
