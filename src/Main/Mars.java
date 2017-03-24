package Main;

import java.util.Arrays;

public class Mars {
	
	private int[][] matriz;
	
	public Mars(int position_x, int position_y) {		
		matriz = new int[position_x+1][position_y+1];
	}

	public int[][] getMatriz() {
		return matriz;
	}

	
	
}
