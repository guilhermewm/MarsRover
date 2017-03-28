package Main;

public class MarsRover {
	private int position_x;
	private int position_y;
	private char direcao;	
	private int matriz_x;
	private int matriz_y;
	
	public MarsRover(int position_x, int position_y, char direcao, int matriz_x, int matriz_y) {
		this.position_x = position_x;
		this.position_y = position_y;
		this.direcao = direcao;
		this.matriz_x = matriz_x;
		this.matriz_y = matriz_y;		
	}

	public int getPosition_x() {
		return position_x;
	}

	public void setPosition_x(int position_x) {
		this.position_x = position_x;
	}

	public int getPosition_y() {
		return position_y;
	}

	public void setPosition_y(int position_y) {
		this.position_y = position_y;
	}
	
	public char getDirecao() {
		return direcao;
	}

	public void setDirecao(char direcao) {
		this.direcao = direcao;
	}

	
	public void roda(String comando){			
		for(char s : comando.toCharArray()){
			if(position_x <= matriz_x && position_y <= matriz_y && position_x >= 0 && position_y >= 0){
				if(s == 'M'){
					if(direcao == 'N'){
						setPosition_y(getPosition_y()+1);
					}else if(direcao == 'S'){
						setPosition_y(getPosition_y()-1);
					}else if(direcao == 'E'){
						setPosition_x(getPosition_x()+1);
					}else if(direcao == 'W'){
						setPosition_x(getPosition_x()-1);
					}
				}
				else if(s == 'R'){
					if(direcao == 'N'){
						setDirecao('E');
					}else if(direcao == 'E'){
						setDirecao('S');
					}else if(direcao == 'S'){
						setDirecao('W');
					}else if(direcao == 'W'){
						setDirecao('N');
					}
				}
				else if(s == 'L'){
					if(direcao == 'N'){
						setDirecao('W');
					}else if(direcao == 'W'){
						setDirecao('S');
					}else if(direcao == 'S'){
						setDirecao('E');
					}else if(direcao == 'E'){
						setDirecao('N');
					}
				}
			}	
		}			
		
		if(getPosition_x() < 0 || getPosition_y() < 0 || getPosition_x() > 5 || getPosition_y() > 5){
			System.out.println(getPosition_x() + " " + getPosition_y() + " " + getDirecao());
			System.out.println("Seu robô se perdeu (saiu da matriz)");
		}else{
			System.out.println(getPosition_x() + " " + getPosition_y() + " " + getDirecao());
		}
		
	}

	

	
	
	
}
