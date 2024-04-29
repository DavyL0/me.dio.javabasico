package com.apps;
public class ReprodutorMusica {
    private void verificaMusica(){
        System.out.println("verifica música");
    }

    public void tocar(String musica){
        verificaMusica();
        System.out.println("tocando " + musica);
    }

    public void pausar(String musica){
        System.out.println("pausar " + musica);
    }

    public void voltar(){
        System.out.println("Voltar música");
    }

    private void buscarMusica(){
        System.out.println("fazendo busca...");
    }

    private void atualizarPagina(){
        System.out.println("update");
    }

    public void exibirMusica(){
        buscarMusica();
        atualizarPagina();
        System.out.println("Música encontrada");
    }

    public void selecionarMusica(String musica){
        verificaMusica();
        tocar(musica);
    }
}
