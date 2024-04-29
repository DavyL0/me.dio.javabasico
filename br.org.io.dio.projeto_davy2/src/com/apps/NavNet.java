package com.apps;
public class NavNet {
    public void escolherPagina(String site){
        verificaPagina(site);
        atualizarPagina();
    }

    private void verificaPagina(String site){
        System.out.println(site + "verificado");
    }

    private void atualizarPagina(){
        System.out.println("Atualizando página");
    }

    
}
