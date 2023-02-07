package br.com.ada;

import br.com.ada.enumates.TypeIphoneEnum;

public class Main {
    public static void main(String[] args) {
        IphoneFactory iphoneFactory = new IphoneFactory();
        System.out.println(iphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_9).exibirDetalhes());
    }
}