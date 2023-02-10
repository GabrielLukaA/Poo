package poo;

public class CriaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		Conta conta2 = new Conta();
		conta.numero = 56;
		conta.agencia = 1;
		System.out.println(conta.agencia);
		System.out.println(conta.numero);
		conta2.numero = 32;
		System.out.println(conta2.numero);
		System.out.println(conta2.agencia);
	}

}
