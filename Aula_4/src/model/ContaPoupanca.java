package model;

public class ContaPoupanca extends Conta{
	private double rendimento;
	ContaPoupanca (String email) {
		super(email);
		this.rendimento = rendimento; 
	}


public String Saque (double valorSaque) { 
	 if(valorSaque <= saldo) {
	
	  saldo =- valorSaque;
	  return  (
			  "Valor Sacado: " + valorSaque
			  +"\nValor Saldo Após o Saque: "
			  + saldo
		);
	 }  else {
		  return "Saldo insuficiente";
	 }
	 
}	 

public String Deposito (double ValorDeposito) {
	  saldo+= (ValorDeposito + (ValorDeposito *rendimento));
	  return ("Valor Sacado: " + ValorDeposito
			+"\nValor Saldo Após o Saque: "
			+ saldo);
}

public double getSaldo() {
	  return saldo;
}

}