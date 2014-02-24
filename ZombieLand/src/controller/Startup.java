package controller;

import java.awt.Point;

import entity.Player;


public class Startup {

	public static void main(String[] args) {
		Player player = new Player("TimMik", new Point(500,500), 100, 10, 10, 10);
		Game game = new Game(player);
		game.run();
	}

}
