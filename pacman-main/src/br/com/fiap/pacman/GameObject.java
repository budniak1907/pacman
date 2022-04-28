package br.com.fiap.pacman;

public class GameObject {
	
	private int x;

	private int y;
	
	private int screenSize = 600;
		
	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x>=0 && x <= this.getScreenSize()) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if(y >= 0 && y <= this.getScreenSize()) {
			this.y = y;
		}
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		if(screenSize > 0) {
			this.screenSize = screenSize;
		}
	}
	
	public GameObject() {
		this.x = 10;
		this.y = 10;
	}
	
	public GameObject(int x, int y) {
		if(x>=0 && x <= this.getScreenSize()) {
			this.setX(x);
		}
		if(y>=0 && y <= this.getScreenSize()) {
			this.setY(y);
		}	
	}
}
