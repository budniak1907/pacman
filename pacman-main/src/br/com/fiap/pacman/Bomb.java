package br.com.fiap.pacman;

public class Bomb extends Item {
	
	
	public Bomb() {
		
	}
	
	public Bomb(int x, int y) {
		if (x <= this.getScreenSize() && x >= 0)
			this.setX(x);
		if (y <= this.getScreenSize() && y >= 0)
			this.setY(y);
	}
	
}
