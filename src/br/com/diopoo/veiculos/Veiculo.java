package br.com.diopoo.veiculos;

public class Veiculo {

    String marca, modelo, cor, combustivel;
    int ano, tamanhoTanque;

    public Veiculo(){}

    public Veiculo(String marca,String modelo,String cor,String combustivel, int ano, int tamanhoTanque){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.ano = ano;
        this.tamanhoTanque = tamanhoTanque;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTamanhoTanque(int tamanhoTanque) {
        this.tamanhoTanque = tamanhoTanque;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getAno() {
        return ano;
    }

    public int getTamanhoTanque() {
        return tamanhoTanque;
    }

}
