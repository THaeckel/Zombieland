package territory;

import java.awt.Point;

import entity.Entity;

public class Coast extends Territory{

	public Coast(String name, int minLevel, int maxLevel) {
		super(name, minLevel, maxLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Entity spawnEnemy(Point position) {
		// TODO Auto-generated method stub
		return null;
	}

}
