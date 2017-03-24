package Main;

public class Main {

	public static void main(String[] args) {
		Mars mars = new Mars(5,5);
		MarsRover mr = new MarsRover(3, 3, 'E', mars.getMatriz().length, mars.getMatriz()[0].length);
		
		mr.roda("MMRMMRMRRM");

	}

}
