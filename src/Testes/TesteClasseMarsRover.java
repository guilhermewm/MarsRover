package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Mars;
import Main.MarsRover;


public class TesteClasseMarsRover {
	private Mars mars;
	private MarsRover mr;
	
	@Before
	public void setUp() throws Exception{
		mars = new Mars(5, 5);
		mr = new MarsRover(1, 1, 'N', 5, 5);
	}
	
	//Testes de direção ao virarem para a direita
	
	@Test
	public void testViraParaADireitaAPartirDoNorte() {
		mr.setDirecao('N');
		mr.roda("R");
		assertEquals('E', mr.getDirecao());
	}

	@Test
	public void testViraParaADireitaAPartirDoLeste() {
		mr.setDirecao('E');
		mr.roda("R");
		assertEquals('S', mr.getDirecao());
	}
	
	@Test
	public void testViraParaADireitaAPartirDoSul() {
		mr.setDirecao('S');
		mr.roda("R");
		assertEquals('W', mr.getDirecao());
	}
	
	@Test
	public void testViraParaADireitaAPartirDoOeste() {
		mr.setDirecao('W');
		mr.roda("R");
		assertEquals('N', mr.getDirecao());
	}
	
	
	//Testes de direção ao virarem para a esquerda
	
	@Test
	public void testViraParaAEsquerdaAPartirDoNorte() {
		mr.setDirecao('N');
		mr.roda("L");
		assertEquals('W', mr.getDirecao());
	}

	@Test
	public void testViraParaAEsquerdaAPartirDoOeste() {
		mr.setDirecao('W');
		mr.roda("L");
		assertEquals('S', mr.getDirecao());
	}
	
	@Test
	public void testViraParaAEsquerdaAPartirDoSul() {
		mr.setDirecao('S');
		mr.roda("L");
		assertEquals('E', mr.getDirecao());
	}
	
	@Test
	public void testViraParaAEsquerdaAPartirDoLeste() {
		mr.setDirecao('E');
		mr.roda("L");
		assertEquals('N', mr.getDirecao());
	}
		
	
	//Teste de posição
		
	@Test
	public void testMoveParaONorte() {
		mr.setDirecao('N');
		mr.roda("M");		
		assertEquals(2, mr.getPosition_y());
	}
	
	@Test
	public void testMoveParaOSul() {
		mr.setDirecao('S');
		mr.roda("M");		
		assertEquals(0, mr.getPosition_y());
	}
	
	@Test
	public void testMoveParaOLeste() {
		mr.setDirecao('E');
		mr.roda("M");		
		assertEquals(2, mr.getPosition_x());
	}
	
	@Test
	public void testMoveParaOOeste() {
		mr.setDirecao('W');
		mr.roda("M");		
		assertEquals(0, mr.getPosition_x());
	}	
	
}
