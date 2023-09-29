package br.com.richard.factory.apple.after.factory;

import br.com.richard.factory.apple.after.model.IPhone;
import br.com.richard.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }

}
