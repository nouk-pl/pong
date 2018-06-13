/**
 * 
 */
package com.imie.pong.model;

/**
 * @author Audrey
 *
 */
public class Field {
	private int taille_x;
	private int taille_y;
	/**
	 * @param taille_x
	 * @param taille_y
	 */
	public Field(int taille_x, int taille_y) {
		super();
		this.taille_x = taille_x;
		this.taille_y = taille_y;
	}
	/**
	 * @return the taille_x
	 */
	public int getTaille_x() {
		return taille_x;
	}
	/**
	 * @return the taille_y
	 */
	public int getTaille_y() {
		return taille_y;
	}


}
