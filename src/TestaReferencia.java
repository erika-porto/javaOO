
public class TestaReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);

//		Fazendo refer�ncia ao mesmo objeto
		Conta segundaConta = primeiraConta;
		System.out.println("Valor da segunda conta referenciando ao mesmo lugar da primeira " + segundaConta.saldo);
		System.out.println("Referencia da primeiraConta " + primeiraConta);
		System.out.println("Refer�ncia da segunda conta = da primeira � " + segundaConta);

//		Somando mais 100 reais a segunda conta ser� que muda na primeira tbm?SIM elas referenciam para o mesmo lugar

		segundaConta.saldo += 100;
		System.out.println("Novo saldo da segundaConta " + segundaConta.saldo);
		System.out.println("Saldo da primeiraConta " + primeiraConta.saldo);

//		verificando se a primeiraConta cont�m as mesmas informa��es da segundaConta

		if (primeiraConta == segundaConta) {
			System.out.println("� a mesma conta");
		}

	}
}
