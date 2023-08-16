package entidades;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusica;

import java.util.Scanner;


public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {
    Scanner sc = new Scanner(System.in);

    @Override
    public void tocar() {
        System.out.println("Musica tocando...");
        System.out.println();
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
        System.out.println();
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Informe o nome da musica: ");
        String nomeMusica = sc.nextLine();
        System.out.println();
        System.out.println("Musica " + nomeMusica + " tocando");
        System.out.println();
    }

    @Override
    public void ligar() {
        System.out.println("Informe o numero de telefone ou o nome do contato que deseja ligar: ");
        String numeroTelefone = sc.nextLine();
        System.out.println("Ligando para " + numeroTelefone);
        System.out.println("Ligancao Encerrada.");
        System.out.println();
    }

    @Override
    public void atender() {
        System.out.println("Alo, quem esta falando?");
        System.out.println(".......................");
        System.out.println("Ligacao Encerrada.");
        System.out.println();
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("<<<Correio de Voz>>>");
        System.out.println("Voce tem 4 mensagens: ");
        System.out.println();
        System.out.println("Ei... blablabla");
        System.out.println("O Churrasco ainda esta ....");
        System.out.println("Me ligue assim que poder....");
        System.out.println("Você é um cara bacanudo....");
        System.out.println();
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina Web aberta.");
        System.out.println();
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
        System.out.println("Digite o nome do site: ");
        String nomeSite = sc.nextLine();
        System.out.println("Navegando: " + nomeSite);
        System.out.println();

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada.");
        System.out.println();

    }
}
