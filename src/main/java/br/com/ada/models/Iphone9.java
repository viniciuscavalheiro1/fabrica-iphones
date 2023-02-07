package br.com.ada.models;

import br.com.ada.intefaces.Iphone;
import br.com.ada.intefaces.IphoneInterface;

public class Iphone9 implements IphoneInterface, Iphone {
    @Override
    public String exibirDetalhes() {
        return "Iphone 9";
    }
}
