package controller;

import java.awt.Point;

import player.Player;

public class Startup {

	public static void main(String[] args) {
		Player player = new Player("TimMik", new Point(1000, 1000), 100, 10, 10, 10, 0);
		Game game = new Game(player);
		game.run();
	}

}
