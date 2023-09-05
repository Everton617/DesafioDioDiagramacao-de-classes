package application;

import entitites.AparelhoTelefonico;
import entitites.NavegadorInternet;
import entitites.ReprodutorMusical;

public class Program {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();
        ReprodutorMusical mp3 = new ReprodutorMusical();

        telefone.atenderLigacao();
        telefone.ligar();
        telefone.iniciarCorreioDeVoz();

        navegador.adicionarPagina();
        navegador.atualizarPagina();
        navegador.exibirPagina();

        mp3.pausarMusica();
        mp3.selecionarMusica();
        mp3.tocarMusica();

    }
}
