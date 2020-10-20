void abreContaSimples(String nome){
	
	nomeDoCorrentista = nome;
	saldo = 0.00;
	contaEEspecial = false;
}

void deposita(float valor){
	
	saldo = saldo + valor;
}

boolean retira(float valor){
	
	if(contaEEspecial == false){
		if(valor <= saldo){
			saldo = saldo - valor;
			return true;
		}else{
			return false;
		}
	}
}

void mostraDados(){
	System.out.println("O nome do correntista é ");
	System.out.println(nomeDoCorrentista);
	System.out.println("O saldo é ");
	System.out.println(saldo);
	
	if(contaEEspecial){
		System.out.println("A conta é especial.");
	}else{
		System.out.println("A conta é comum.");
	}
}

Class TestaContaBancariaSimplificada{
	public static void maind(String []args){
		
		ContaBancariaSimplificada c1;
		c1 = new ContaBancariaSimplificada();
		c1.abreContaSimples("Maria");
		ContaBancariaSimplificada c2 = new ContaBancariaSimplificada();
		c2.abreContaSimples("João");
		c1.deposita(200);
		c2.saldo = 1000;
		
		if(c1.retira(300)){
			System.out.println("Saque realizado com sucesso!");
		}else{
			System.out.println("saldo insuficiente!");
		}
		c1.mostraDados();
		c2.mostraDados();
	}
}