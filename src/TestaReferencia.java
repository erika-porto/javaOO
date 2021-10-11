
public class TestaReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta " + primeiraConta.saldo);

//		Fazendo referência ao mesmo objeto
		Conta segundaConta = primeiraConta;
		System.out.println("Valor da segunda conta referenciando ao mesmo lugar da primeira " + segundaConta.saldo);
		System.out.println("Referencia da primeiraConta " + primeiraConta);
		System.out.println("Referência da segunda conta = da primeira é " + segundaConta);

//		Somando mais 100 reais a segunda conta será que muda na primeira tbm?SIM elas referenciam para o mesmo lugar

		segundaConta.saldo += 100;
		System.out.println("Novo saldo da segundaConta " + segundaConta.saldo);
		System.out.println("Saldo da primeiraConta " + primeiraConta.saldo);

//		verificando se a primeiraConta contém as mesmas informações da segundaConta

		if (primeiraConta == segundaConta) {
			System.out.println("é a mesma conta");
		}

	}
}
