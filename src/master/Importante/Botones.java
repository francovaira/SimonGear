package master.Importante;

public enum Botones {
	
	ROJO(1), VERDE(2), AZUL(3), AMARILLO(4);
	
	int valor;
	
	private Botones(int valor){
		this.valor = valor;
	}
	
	public int getValor(){
		
		return valor;
	}
}
