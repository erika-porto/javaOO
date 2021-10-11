
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo=new Conta();
		
		contaDoPaulo.saldo=100;
		
//		invocando a função criada deposita -> vai somar o valor de 100 com o 50 ->150
		
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
//		contaDoPaulo.saca(20);
//		System.out.println(contaDoPaulo.saldo);
		 
//		Para ver oq ele me retorna eu coloco contaDoPaulo.saca num boolen conseguiuRetirar q me retorna true
		
		boolean conseguiuRetirar=contaDoPaulo.saca(20); //TESTANDO MÉTODO SACA
		System.out.println(conseguiuRetirar);
		
//		TESTANDO MÉTODO TRANSFERE
		Conta contaDaMelissa=new Conta();
		contaDaMelissa.deposita(1000);
//		contaDaMelissa.transfere(300, contaDoPaulo);
		
		boolean sucessoDaTransferencia=contaDaMelissa.transfere(3000, contaDoPaulo);
		
		if(sucessoDaTransferencia) {
			System.out.println("Sucesso na transferência!");
		}else {
			System.out.println("Não foi possível.");
		}
		
		
		System.out.println("O saldo atual da conta de Melissa é " + contaDaMelissa.saldo);
		System.out.println("O saldo atual da conta do Paulo é " + contaDoPaulo.saldo);
	}
	
	    
}
