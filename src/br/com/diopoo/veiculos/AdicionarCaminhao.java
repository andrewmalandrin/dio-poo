package br.com.diopoo.veiculos;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AdicionarCaminhao {

    public static Caminhao AdicionarCaminhao() {
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

        System.out.println("Tipo: ");
        String carroceria = scan.nextLine();

        System.out.println("Direcao: ");
        String direcao = scan.nextLine();

        System.out.println("Suspensão: ");
        String suspensao = scan.nextLine();

        Caminhao caminhao = new Caminhao(marca, modelo, cor, combustivel, ano, tamanhoTanque, carroceria, direcao,
                suspensao);

        return caminhao;


    }
}
