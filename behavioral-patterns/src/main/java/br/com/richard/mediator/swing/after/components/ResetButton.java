package br.com.richard.mediator.swing.after.components;

import br.com.richard.mediator.swing.after.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;
	
	public ResetButton(Mediator mediator) {
		super("Reset");
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mediator.reset();
			}
		});
	}
}
