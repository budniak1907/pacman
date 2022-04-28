package br.com.fiap.pacman;

import java.util.Random;

public class Ghost extends GameObject{
	
	private int direction;
	
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		if(direction == 0 || direction == 90 || direction == 180 || direction == 270) {
			this.direction = direction;
		}
	}

	public void DirectionGhost() {
		Random random = new Random();
		int SelectDirection = random.nextInt(4);
		if(SelectDirection == 0) {
			setDirection(0);
		}
		if(SelectDirection == 1) {
			setDirection(90);
		}
		if(SelectDirection == 2) {
			setDirection(180);
		}
		if(SelectDirection == 3) {
			setDirection(270);
		}
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
	
	public void move() {
		if(this.canMove() == true) {
			this.DirectionGhost();
			if(this.direction == 0) {
				this.setY(this.getY()-10);
			}
			if(this.direction == 90) {
				this.setX(this.getX()+10);
			}
			if(this.direction == 180) {
				this.setY(this.getY()+10);
			}
			if(this.direction == 270) {
				this.setX(this.getX()-10);
			}
		}
	}

	public Ghost (int x, int y, int d) {
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
	
	public Ghost() {
		this.direction = 0;
	}
}
