package br.com.ada.models;

import br.com.ada.intefaces.IphoneInterface;

public class Iphone13Mini extends Iphone implements IphoneInterface {
    @Override
    public String exibirDetalhes() {
        return "Iphone 13 Mini";
    }
}
