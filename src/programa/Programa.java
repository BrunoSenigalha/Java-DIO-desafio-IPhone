package programa;

import entidades.IPhone;
import utilitarios.Menus;


import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("...........Bem vindo ao IPhone!...........");
        System.out.println();
        int opcao;

        IPhone iphone = new IPhone();

        while (true) {
            Menus.mostrarMenuPrincipal();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    Menus.menuIpod(iphone);
                }

                case 2 -> {
                    Menus.menuTelefone(iphone);
                }

                case 3 -> {
                    Menus.menuInternet(iphone);
                }

                case 4 -> {
                    System.out.println("Desligando o sistema.");
                    System.exit(0);
                }

                default -> throw new IllegalStateException("Opcao Inexperada: " + opcao);
            }
        }
    }
}
