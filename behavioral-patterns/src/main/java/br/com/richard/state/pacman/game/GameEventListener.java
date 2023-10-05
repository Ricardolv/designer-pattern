package br.com.richard.state.pacman.game;

@FunctionalInterface
public interface GameEventListener {
    
    void onAction(String option);
}
