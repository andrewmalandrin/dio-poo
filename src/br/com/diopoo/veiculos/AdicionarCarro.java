package br.com.diopoo.veiculos;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AdicionarCarro {

    public static Carro AdicionarCarro() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Marca: ");
        String marca = scan.nextLine();

        System.out.println("Modelo: ");
        String modelo = scan.nextLine();

        System.out.println("Cor: ");
        String cor = scan.nextLine();

        System.out.println("Combustivel: ");
        String combustivel = scan.nextLine();

        System.out.println("Ano: ");
        int ano = parseInt(scan.nextLine());

        System.out.println("Tamanho do tanque: ");
        int tamanhoTanque = parseInt(scan.nextLine());

        System.out.println("Carroceria: ");
        String carroceria = scan.nextLine();

        System.out.println("Direcao: ");
        String direcao = scan.nextLine();

        System.out.println("Cambia: ");
        String cambio = scan.nextLine();

        System.out.println("Portas: ");
        int portas = parseInt(scan.nextLine());

        System.out.println("Motor: ");
        double motor = Double.parseDouble(scan.nextLine());


        Carro carro = new Carro(marca, modelo, cor, combustivel, ano, tamanhoTanque, carroceria, direcao, cambio, portas, motor);

        return carro;


    }
}
