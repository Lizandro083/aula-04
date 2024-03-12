package view;

import model.ContaCorrente;
import model.ContaPoupanca;

public class UsuarioView {
	Mensagens mensagem = new Mensagens();
	
   public void InterfaceDoUsuario () {
	   int Opcao;
	   String OpcaoSelecionada;
	   
	   
	   OpcaoSelecionada = mensagem.solicitarEntrada(""
	        + "Selecione uma opção"
			+ "\n1- Criar conta"   
			+ "\n2- Fazer saque"   
			+  "\n3- Verificar saldo");   
		Opcao = Integer.parseInt(OpcaoSelecionada);
	     switch (Opcao) {
	     case 1:	 
	     String tipoDeConta;
	      tipoDeConta = mensagem.solicitarEntrada(
	    		"Qual Tipo de conta você deseja?"
	    		+ "\n1- Conta Poupanca"
	    		+ "\n2- Conta corrente");		
	    		
	      String EmailUsuario;
	      
	      EmailUsuario = mensagem
	        .solicitarEntrada("Digite o seu email");
	      
	      if(tipoDeConta.equals("1"))  {
	    	    ContaPoupanca conta = new ContaPoupanca(EmailUsuario);
	      }
	      if(tipoDeConta.equals("2")) {
	      		ContaCorrente conta = new ContaCorrente(EmailUsuario, 2);
	      }
	    	
	    	 
	       break; 
	       
	     case 2:
	      break;  
     }
  }
   
