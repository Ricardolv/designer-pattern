package br.com.richard.state.headphone.after.states;

import br.com.richard.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
