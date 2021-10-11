
public class CriaConta {
	public static void main(String[] args) {
       Conta primeiraConta= new Conta();
       primeiraConta.saldo=200;
       System.out.println("O Saldo da primeira conta: " + primeiraConta.saldo);
       
       Conta segundaConta=new Conta();
       segundaConta.saldo=50;
       segundaConta.saldo+=100;
       
       System.out.println("A referencia de primeira conta " + primeiraConta);
       System.out.println("A referencia de segunda conta " + segundaConta);
       
       if(primeiraConta == segundaConta) {
           System.out.println("mesma conta");
       } else {
           System.out.println("contas diferentes");
       }
       
       
//       System.out.println("O Saldo da segunda conta: " + segundaConta.saldo);
//       System.out.println("A agencia bancária por default configurada é " + segundaConta.agencia);
//       segundaConta.agencia=53;
//       System.out.println("Agora vou alterar a agencia bancaria para " + segundaConta.agencia);
	}
}
