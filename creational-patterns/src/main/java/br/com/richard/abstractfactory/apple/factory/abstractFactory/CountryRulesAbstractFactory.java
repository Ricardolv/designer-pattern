package br.com.richard.abstractfactory.apple.factory.abstractFactory;

import br.com.richard.abstractfactory.apple.model.certificate.Certificate;
import br.com.richard.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
