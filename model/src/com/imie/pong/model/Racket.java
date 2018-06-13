/**
 * 
 */
package com.imie.pong.model;

/**
 * @author Audrey
 *
 */
public class Racket {
	public static final int SIZE = 2;
	private String name;
	private int[] position_y = new int[2];
	private int side;

	/**
	 * @return the side
	 */
	public int getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(int side) {
		this.side = side;
	}

	public Racket(String name, int side_x) {
		this.setName(name);
		this.setSide(side_x);

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the position
	 */
	public int[] getPosition() {
		return position_y;
	}

	/**
	 * @param y1 the position to set
	 */
	public void setPosition(int y) {
		this.position_y[0] = y;
		this.position_y[1] = y + SIZE;
		
	}
}
