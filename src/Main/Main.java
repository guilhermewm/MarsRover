package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Mars mars; 	
		MarsRover mr;
		TrataStringScanner tratamento = new TrataStringScanner();
		
		
		System.out.println("Digite o tamanho da matriz. Ex: 5 5");		
		Scanner sc = new Scanner(System.in); 
		String result_matriz = sc.nextLine();	
				
		tratamento.trataStringValoresIniciaisMatriz(result_matriz);		
		mars = new Mars(tratamento.getXmatriz(), tratamento.getYmatriz());
	
		System.out.println("Digite a posição e a direção inicial do robô. Ex: 3 3 N");		
		Scanner sc1 = new Scanner(System.in); 
		String result_posicao_inicial = sc1.nextLine();
		
		tratamento.trataStringValoresIniciaisRobo(result_posicao_inicial);	
		mr = new MarsRover(tratamento.getXposicaoinicial(), tratamento.getYposicaoinicial(), tratamento.getDirecaoinicial(), mars.getMatriz().length, mars.getMatriz()[0].length);
				
		System.out.println("Digite os comandos para o robô executar. Ex: MRMLM");		
		Scanner sc2 = new Scanner(System.in); 
		String  comandos_robo = sc2.next();
		
		mr.roda(comandos_robo);

	}

}
