package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Mars;
import Main.TrataStringScanner;
public class TesteClasseTrataStringScanner {

	TrataStringScanner tratamento;
	String valores_digitados_para_matriz;
	String valores_digitados_para_robo;
	
	
	@Before
	public void setUp() throws Exception{
		tratamento = new TrataStringScanner();
		valores_digitados_para_matriz = "5 5";
		valores_digitados_para_robo = "1 2 N";
	}
	
	
	//Teste String de valores iniciais da matriz
	
	@Test
	public void testTrataStringValoresIniciaisMatrizX() {
		tratamento.trataStringValoresIniciaisMatriz(valores_digitados_para_matriz);
		int actual = tratamento.getXmatriz();
		assertEquals(5, actual);
	}
	
	@Test
	public void testTrataStringValoresIniciaisMatrizY() {
		tratamento.trataStringValoresIniciaisMatriz(valores_digitados_para_matriz);
		int actual = tratamento.getYmatriz();
		assertEquals(5, actual);
	}
	
	
	//Teste String de valores iniciais do robo
	
	@Test
	public void trataStringValoresIniciaisRoboX() {
		tratamento.trataStringValoresIniciaisRobo(valores_digitados_para_robo);
		int actual = tratamento.getXposicaoinicial();
		assertEquals(1, actual);
	}
	
	@Test
	public void trataStringValoresIniciaisRoboY() {
		tratamento.trataStringValoresIniciaisRobo(valores_digitados_para_robo);
		int actual = tratamento.getYposicaoinicial();
		assertEquals(2, actual);
	}
	
	@Test
	public void trataStringValoresIniciaisRoboDirecao() {
		tratamento.trataStringValoresIniciaisRobo(valores_digitados_para_robo);
		char actual = tratamento.getDirecaoinicial();
		assertEquals('N', actual);
	}
	

}
