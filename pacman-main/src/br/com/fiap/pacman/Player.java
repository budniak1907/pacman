package br.com.fiap.pacman;

public class Player extends GameObject {
	
	private int life;
	
	private int direction;
	
	private boolean invencivel;

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		if(getLife() >= 0) {
			this.life = life;
		}
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		if(direction == 0 || direction == 90 || direction == 180 || direction == 270) {
			this.direction = direction;
		}
	}

	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}
	
	public boolean canMove() {
		boolean r = false;
		if(this.getDirection() == 0) {
			if(this.getY()+10 >= 0) {
				r = true;
			}
		}
		if(this.getDirection() == 90) {
			if(this.getX()+10 <= this.getScreenSize()) {
				r = true;
			}
		}
		if(this.getDirection() == 180) {
			if(this.getY()+10 <= this.getScreenSize()) {
				r = true;
			}
		}
		if(this.getDirection() == 270) {
			if(this.getX()+10 >= 0) {
				r = true;
			}
		}
		return r;
	}

	
	public Player() {
		this.life = 15;
		this.invencivel = false;
		this.direction = 0;
	}
	
	public Player(int x, int y, int d) {
		if(x>=0 && x <= this.getScreenSize()) {
			this.setX(x);
		}
		if(y>=0 && y <= this.getScreenSize()) {
			this.setY(y);
		}
		if(d == 0 || d == 90 || d == 180 || d == 270) {
			this.direction = d;
		}
	}
	public void move() {
		if(this.canMove() == true) {
			if(this.getDirection() == 0) {
				this.setY(this.getY()-10);
			}
			if(this.getDirection() == 90) {
				this.setX(this.getX()+10);
			}
			if(this.getDirection() == 180) {
				this.setY(this.getY()+10);
			}
			if(this.getDirection() == 270) {
				this.setX(this.getX()-10);
			}
		}
	}
}
