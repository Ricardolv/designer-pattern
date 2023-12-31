package br.com.richard.mediator.translate.mediator;

import br.com.richard.mediator.translate.services.Translator;
import br.com.richard.mediator.translate.model.User;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
