package br.com.richard.builder.spolleto.after.model.builder;

import br.com.richard.builder.spolleto.after.model.Salad;

public class SaladBuilder extends MealBuilderOpt {

	public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}
