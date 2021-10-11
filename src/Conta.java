class Conta{
	double saldo;
	int agencia=42;
	int numero;
	String titular;
	
//	CRIANDO UM MÉTODO DEPOSITA
	
	void deposita(double valor) {
//		saldo=saldo + valor
		saldo+=valor;
	}
	
//	MÉTODO SACA
	public boolean saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
//	MÉTODO TRANSFERE
	public boolean transfere(double valor,Conta destino) {
		if(saldo >= valor) {
			saldo -=valor;
			destino.deposita(valor); // o mesmo que destino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
}