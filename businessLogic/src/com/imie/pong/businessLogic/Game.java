package com.imie.pong.businessLogic;

public class Game {

	public moveRacket(Racket racket) {
		
		boolean sens = randomRacketMove();
		
		int[] position = racket.getPosition();
					
		// si le sens est true --> droite
		// sinon --> gauche
		
		// incrémente la position de la raquette de +1
		if(hitTheWall(position, sens)) return;
		
		for(int pos : position) {
			pos++;
		}	
		
		if(sens) {
			
			for(int pos : position) {
				pos++;
			}	
				
		}
		else {
			
			for(int pos : position) {
				pos--;
			}	
			
		}
		
	}

	public boolean randomRacketMove() {
		return Math.random() < 0.5;
	}

	/**
	 * Indique si la raquette touche un mur
	 * 
	 * @param position
	 * @param sens
	 * @return
	 */
	public boolean hitTheWall(int[] position, boolean sens) {
		return sens ? position[1] == 4 : position[0] == 0;
	}
}
