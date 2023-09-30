package br.com.richard.abstractfactory.app.service;

import br.com.richard.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.richard.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.richard.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.richard.abstractfactory.app.service.services.CarService;
import br.com.richard.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory ejbAbstractFactoryJ = new EJBAbstractFactory();

		UserService userService = ejbAbstractFactoryJ.getUserService();
		userService.save("Jhon");
		userService.delete(5);
		
		CarService carService = ejbAbstractFactoryJ.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");

		ServicesAbstractFactory restAbstractFactory = new RestAbstractFactory();

		UserService userServiceRest = restAbstractFactory.getUserService();
		userServiceRest.save("Richard");
		userServiceRest.delete(3);

		CarService carServiceRest = restAbstractFactory.getCarService();
		carServiceRest.save("Jeep Compass");
		carServiceRest.update("RamPage");
	}
}
