package com.apps;
public class Telefone {
    public void escolherTele(int tele){
        verificaTele(tele);
        System.out.println(tele + "escolhido");
    }

    private void verificaTele(int tele){
        System.out.println("verifica telefone " + tele);
    }

    public void ligar(){
        System.out.println("Efetuando ligação");
    }
    public void atender(int tele){
        verificaTele(tele);
        System.out.println("Aló!");
    }

    private void verificaCorreioVoz(){
        System.out.println("verificando correio de voz");
    }

    public void iniciarCorrerioVoz(){
        verificaCorreioVoz();
        System.out.println("Inicia Correio");
    }
}
