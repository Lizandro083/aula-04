package model;

public class ContaCorrente extends Conta {
   private double ValorTaxa;
	
	public ContaCorrente(String email,double ValorTaxa) {
		super(email);
		this.ValorTaxa = ValorTaxa;
		// TODO Auto-generated constructor stub
	}


  public String Saque (double valorSaque) { 
	 if(valorSaque + ValorTaxa <= saldo) {
	  saldo =- ValorTaxa; 
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
	  saldo+=ValorDeposito;
	  return ("Valor Sacado: " + ValorDeposito
			+"\nValor Saldo Após o Saque: "
			+ saldo);
  }

  public double getSaldo() {
	  return saldo;
  }
  
}
  