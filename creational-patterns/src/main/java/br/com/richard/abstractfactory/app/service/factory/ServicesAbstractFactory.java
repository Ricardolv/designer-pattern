package br.com.richard.abstractfactory.app.service.factory;

import br.com.richard.abstractfactory.app.service.services.CarService;
import br.com.richard.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
