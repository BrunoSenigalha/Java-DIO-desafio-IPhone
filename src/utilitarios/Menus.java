package utilitarios;

import entidades.IPhone;

import java.util.Scanner;

public class Menus {

    public static void mostrarMenuPrincipal() {
        System.out.println("Escolha uma das opcoes!");
        System.out.println();
        System.out.println("MUSICA [1]");
        System.out.println("TELEFONE [2]");
        System.out.println("INTERNET [3]");
        System.out.println("DESLIGAR [4]");
    }

    public static void menuIpod(IPhone iphone) {
        System.out.println("<<<Ipod>>>");

        int opcao;
        do {
            System.out.println("Tocar Musica (1)");
            System.out.println("Parar Musica (2)");
            System.out.println("Trocar Musica (3)");
            System.out.println("Voltar ao Menu (4)");
            opcao = new Scanner(System.in).nextInt();

            if (opcao == 1) {
                iphone.tocar();
            } else if (opcao == 2) {
                iphone.pausar();
            } else if (opcao == 3) {
                iphone.selecionarMusica();

            } else
                opcao = 4;

        } while (opcao != 4);
    }
    public static void menuTelefone(IPhone iphone){
        System.out.println("<<<Menu Telefone>>>");

        int opcao;
        do {
            System.out.println("Ligar (1)");
            System.out.println("Atender (2)");
            System.out.println("Iniciar Correio de Voz (3)");
            System.out.println("Voltar ao Menu (4)");
            opcao = new Scanner(System.in).nextInt();
            if (opcao == 1) {
                iphone.ligar();

            } else if (opcao == 2) {
                iphone.atender();

            } else if (opcao == 3) {
                iphone.iniciarCorreioVoz();

            } else
                opcao = 4;

        } while (opcao != 4);
    }
    public static void menuInternet(IPhone iphone){
        System.out.println("<<<Menu Internet>>>");

        int opcao;
        do {
            System.out.println("Abrir Página Web (1)");
            System.out.println("Nova Aba (2)");
            System.out.println("Atualizar pagina(3)");
            System.out.println("Voltar ao Menu (4)");
            opcao = new Scanner(System.in).nextInt();

            if (opcao == 1) {
                iphone.exibirPagina();

            } else if (opcao == 2) {
                iphone.adicionarNovaAba();

            } else if (opcao == 3) {
                iphone.atualizarPagina();

            } else
                opcao = 4;

        } while (opcao != 4);

    }
}
