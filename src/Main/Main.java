package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mars mars; 		
		
		String x_matrix = "";
		String y_matriz = "";
		boolean flag_matriz = false;
		
		System.out.println("Digite o tamanho da matriz. Ex: 5,5");		
		Scanner sc = new Scanner(System.in); 
		String result_matriz = sc.next();	
				
		for(char s : result_matriz.toCharArray()){
			if(flag_matriz == false){
				if(s != ','){
					x_matrix += s;				
				}else{
					flag_matriz = true;
				}
			}else{
				y_matriz += s;
			}
		}		
		mars = new Mars(Integer.parseInt(x_matrix), Integer.parseInt(y_matriz));
	
		MarsRover mr = new MarsRover(3, 3, 'E', mars.getMatriz().length, mars.getMatriz()[0].length);
		
		
		
		
		
		
		
		mr.roda("MMRMMRMRRM");

	}

}
