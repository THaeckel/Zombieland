package controller;

import java.awt.Point;

import player.Player;

public class Startup {

	public static void main(String[] args) {
		Player player = new Player(1,"TimMik", new Point(500, 500), 100, 10, 10, 10, 0);
		Game game = new Game(player);
		game.run();
	}

}
