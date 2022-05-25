package br.com.diopoo.veiculos;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AdicionarMoto {

    public static Moto AdicionarMoto() {
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

        System.out.println("Cilindrada: ");
        int cilindrada = parseInt(scan.nextLine());

        Moto moto = new Moto(marca, modelo, cor, combustivel, ano, tamanhoTanque, cilindrada);

        return moto;


    }
}
