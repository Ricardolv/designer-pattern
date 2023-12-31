package br.com.richard.observer.party.after.subject;

import br.com.richard.observer.party.after.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(boolean status) {
		for(Observer o: observers) {
			o.update(status);
		}
	}
}
