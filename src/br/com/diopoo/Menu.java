package br.com.diopoo;

import br.com.diopoo.usuarios.Usuario;
import br.com.diopoo.veiculos.*;
import br.com.diopoo.vendas.Venda;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Menu {

    static Scanner scan = new Scanner(System.in);
    static boolean closeMenu = false;


    public static void menuPrincipal(){

        int opcao;

        System.out.println("Selecione uma das opcoes para adicionar ao sistema:");
        System.out.println("1-Adicionar usuario");
        System.out.println("2-Adicionar veiculo");
        System.out.println("3-Informar venda");
        System.out.println("4-Sair");

        opcao = parseInt(scan.nextLine());

        while(!closeMenu){
            switch (opcao){
                case 1:
                    adicionarUsuario();
                    closeMenu = true;
                     break;

                case 2:
                    menuVeiculo();
                    closeMenu = true;
                    break;

                case 3:
                    adicionarVenda();
                    closeMenu = true;
                    break;

                case 4:
                    closeMenu = true;
                    break;

                default:

                    break;


            }
        }
    }


    public static void menuVeiculo(){
        Scanner scan = new Scanner(System.in);

        int opcao;

        System.out.println("Selecione uma das opcoes para adicionar ao sistema:");
        System.out.println("1-Carro");
        System.out.println("2-Moto");
        System.out.println("3-Caminhao");
        System.out.println("4-Sair");

        opcao = parseInt(scan.nextLine());

        while(!closeMenu){

            switch (opcao){
                case 1:
                    adicionarCarro();
                    closeMenu = true;
                    break;

                case 2:
                    adicionarMoto();
                    closeMenu = true;
                    break;

                case 3:
                    adicionarCaminhao();
                    closeMenu = true;
                    break;

                case 4:
                    closeMenu = true;
                    break;

                default:
                    System.out.println("Valor incorreto, apenas os valores 1, 2 ou 3 são aceitos.\n");
                    break;

            }
        }
    }

    protected static void adicionarUsuario(){

        System.out.println("Nome Completo");
        String nomeCompleto = scan.nextLine();

        System.out.println("Nome de usuario");
        String nomeUsuario = scan.nextLine();

        System.out.println("Senha");
        String senha = scan.nextLine();

        System.out.println("Data de nascimento");
        String dataNascimento = scan.nextLine();

        System.out.println("ID");
        int id = parseInt(scan.nextLine());

        Usuario usuario = new Usuario(id, nomeCompleto, nomeUsuario, senha, dataNascimento);

        System.out.println("Usuário adicionado: ");
        System.out.println("Nome: " + usuario.getNomeCompleto());
        System.out.println("Username: " + usuario.getNomeUsuario());
        System.out.println("Data de nascimento: " + usuario.getDataNascimento());
    }

    protected static void adicionarVenda(){
        System.out.println("Pagamento");
        String pagamento = scan.nextLine();

        System.out.println("Id do usuario");
        int idUsuario = parseInt(scan.nextLine());

        System.out.println("Id do produto");
        int idProduto = parseInt(scan.nextLine());

        System.out.println("Parcelas");
        int parcelas = parseInt(scan.nextLine());

        Venda venda = new Venda(pagamento,idUsuario, idProduto, parcelas);

        System.out.println("Venda concretizada: ");
        System.out.println("Pagamento: " + venda.getPagamento());
        System.out.println("Id do usuario: " + venda.getIdUsuario());
        System.out.println("Id do produto: " + venda.getIdProduto());
        System.out.println("Parcelas: " + venda.getParcelas());
    }

    protected static void adicionarCarro(){
        // Chamada/Assinatura do método
        Carro carro = AdicionarCarro.AdicionarCarro();
        System.out.println("Veiculo adicionado");

        //Veiculo
        System.out.println("Carro: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Combustivel: " + carro.getCombustivel());
        System.out.println("Tamanho do tanque em litros: " + carro.getTamanhoTanque());

        //Carro
        System.out.println("Carroceria: " + carro.getCarroceria());
        System.out.println("Direcao: " + carro.getDirecao());
        System.out.println("Cambio: " + carro.getCambio());
        System.out.println("Portas: " + carro.getPortas());
        System.out.println("Motor: " + carro.getMotor());
    }

    protected static void adicionarMoto(){
        // Chamada/Assinatura do método
        Moto moto = AdicionarMoto.AdicionarMoto();
        System.out.println("Veiculo adicionado");

        //Veiculo
        System.out.println("Moto: " + moto.getModelo());
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Combustivel: " + moto.getCombustivel());
        System.out.println("Tamanho do tanque em litros: " + moto.getTamanhoTanque());

        //Moto
        System.out.println("Cilindrada: " + moto.getCilindrada());
    }

    protected static void adicionarCaminhao(){
        // Chamada/Assinatura do método
        Caminhao caminhao = AdicionarCaminhao.AdicionarCaminhao();
        System.out.println("Veiculo adicionado");

        //Veiculo
        System.out.println("Carro: " + caminhao.getModelo());
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Ano: " + caminhao.getAno());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Combustivel: " + caminhao.getCombustivel());
        System.out.println("Tamanho do tanque em litros: " + caminhao.getTamanhoTanque());


        //Carro
        System.out.println("Tipo: " + caminhao.getTipo());
        System.out.println("Direcao: " + caminhao.getDirecao());
        System.out.println("Suspensao: " + caminhao.getSuspensao());
    }





}


