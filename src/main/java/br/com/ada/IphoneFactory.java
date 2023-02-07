package br.com.ada;

import br.com.ada.enumates.TypeIphoneEnum;
import br.com.ada.intefaces.IphoneInterface;
import br.com.ada.models.Iphone13Mini;
import br.com.ada.models.Iphone9;
import br.com.ada.models.IphoneX;

public class IphoneFactory {
    public IphoneInterface cadastrarIphone(TypeIphoneEnum typeIphoneEnum) {
        if(typeIphoneEnum.equals(TypeIphoneEnum.IPHONE_9)) {
            return new Iphone9();
        } else if(typeIphoneEnum.equals(TypeIphoneEnum.IPHONE_X)){
            return new IphoneX();
        } else if(typeIphoneEnum.equals(TypeIphoneEnum.IPHONE_13_MINI)) {
            return new Iphone13Mini();
        }
        return null;
    }
}
