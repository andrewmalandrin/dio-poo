package br.com.diopoo.veiculos;


public class Carro extends Veiculo {

    String carroceria, direcao, cambio;
    int portas;
    double motor;

    public Carro() {
        super();
    }

    public Carro(String marca,String modelo,String cor,String combustivel, int ano, int tamanhoTanque,
                 String carroceria, String direcao, String cambio, int portas, double motor) {

        super(marca, modelo, cor, combustivel, ano, tamanhoTanque);
        this.carroceria = carroceria;
        this.direcao = direcao;
        this.cambio = cambio;
        this.portas = portas;
        this.motor = motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public String getDirecao() {
        return direcao;
    }

    public String getCambio() {
        return cambio;
    }

    public int getPortas() {
        return portas;
    }

    public double getMotor() {
        return motor;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }
}
