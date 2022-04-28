package br.com.fiap.pacman;

public class Item extends GameObject {
	
	private boolean visible;
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public Item() {
		this.visible = true;
	}
	
	public Item(int x, int y) {
		if(x>=0 && x <= this.getScreenSize()) {
			this.setX(x);
		}
		if(y>=0 && y <= this.getScreenSize()) {
			this.setY(y);
		}
	}

}
