package br.com.ada.models;

import br.com.ada.intefaces.IphoneInterface;

public class IphoneX implements IphoneInterface {
    @Override
    public String exibirDetalhes() {
        return "Iphone X";
    }
}
