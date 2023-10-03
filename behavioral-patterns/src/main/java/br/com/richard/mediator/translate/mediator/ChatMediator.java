package br.com.richard.mediator.translate.mediator;

import br.com.richard.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
