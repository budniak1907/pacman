package br.com.fiap.pacman;

public class Booster extends Item {
	
	private int save;
	
	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}

	public Booster() {

	}
	
	public Booster(int x, int y, int save) {
		if (x <= this.getScreenSize() && x >= 0)
			this.setX(x);
		if (y <= this.getScreenSize() && y >= 0)
			this.setY(y);
		if (save >= 0)
			this.save = save;
	}
}
