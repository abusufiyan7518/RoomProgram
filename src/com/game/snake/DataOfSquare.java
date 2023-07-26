package com.game.snake;
import java.awt.Color;
import java.util.ArrayList;
public class DataOfSquare {
	ArrayList<Color> C = new ArrayList<Color>();
	int color; 	SquarePanel square;
	public DataOfSquare(int col) {
		C.add(Color.darkGray);
		C.add(Color.BLUE); 
		C.add(Color.white); 
		color = col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c) {
		square.ChangeColor(C.get(c));
	}
}