package teste; 

public class TesteContas {

	public static void main(String[] args) {
		
		modelo.Conta conta = new modelo.Conta(1337, 23334);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas : " + modelo.Conta.getTotal());
		
	}
	
}
