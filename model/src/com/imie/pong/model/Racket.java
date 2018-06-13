/**
 * 
 */
package com.imie.pong.model;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

/**
 * @author Audrey
 *
 */
public class Racket {
	public static final int SIZE = 4;
	private String name;
	private int[] position_y = new int[2];
	private int side;

	public Racket(String name, String side, Field f) {
		this.setName(name);
		if (side.equals("right")) {
			this.side = -1;
		} else
			if (side.equals("left")) {
				this.side = 0;
			} else {
				System.out.println("ERROR - the racket could not be positioned in the field");
		}
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
	public void setPosition(int y1, int y) {
		this.position_y[0] = y1;
		this.position_y[1] = y;
		
	}
}
