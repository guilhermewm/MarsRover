package Main;

public class TrataStringScanner {
	private String x_matriz;
	private String y_matriz;	
	private boolean flag_matriz;
	
	private String x_posicao_inicial;
	private String y_posicao_inicial;
	private char direcao_inicial;
	private boolean flag_posicao_inicial1;
	private boolean flag_posicao_inicial2;
	
	
	
	public TrataStringScanner() {
		this.x_matriz = "";
		this.y_matriz = "";
		this.flag_matriz = false;
		
		this.x_posicao_inicial = "";
		this.y_posicao_inicial = "";
		this.direcao_inicial = 0;
		this.flag_posicao_inicial1 = false;
		this.flag_posicao_inicial2 = false;
	}

	

	public void trataStringValoresIniciaisMatriz(String result_matriz){
		for(char s : result_matriz.toCharArray()){
			if(flag_matriz == false){
				if(s != ' '){
					this.x_matriz += s;				
				}else{
					this.flag_matriz = true;
				}
			}else{
				this.y_matriz += s;
			}
		}
	}
	
	public void trataStringValoresIniciaisRobo(String result_posicao_inicial){
		for(char s : result_posicao_inicial.toCharArray()){
			if(flag_posicao_inicial1 == false && flag_posicao_inicial2 == false){
				if(s != ' '){
					this.x_posicao_inicial += s;				
				}else{
					this.flag_posicao_inicial1 = true;
				}
			}else if(flag_posicao_inicial1 == true && flag_posicao_inicial2 == false){
				if(s != ' '){
					this.y_posicao_inicial += s;
				}else{					
					this.flag_posicao_inicial2 = true;
				}
			}else if(flag_posicao_inicial1 == true && flag_posicao_inicial2 == true){
				this.direcao_inicial = s;
			}
		}
	}

	public char getDirecaoinicial() {
		return direcao_inicial;
	}

	public int getXmatrix() {
		return Integer.parseInt(x_matriz);
	}
	

	public int getYmatriz() {
		return Integer.parseInt(y_matriz);
	}

	public int getXposicaoinicial() {
		return Integer.parseInt(x_posicao_inicial);
	}

	public int getYposicaoinicial() {
		return Integer.parseInt(y_posicao_inicial);
	}
		
}
