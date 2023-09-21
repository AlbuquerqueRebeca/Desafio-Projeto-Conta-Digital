package OrientaçãoObjetos;

import java.util.Scanner;

public class Conta {

//atributo 
	
		private int numero;
		private String agencia;
		private String nomeCliente;
		private double saldo;
		        double deposito;
		        double saque;
		        double tranferencia;
		
		
		
		
		
		//metodos 
		
		public void adicionarNumero() {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite o número da conta: ");
			this.numero = entrada.nextInt();
		}
		
		public void adicionarAgencia() {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite o número da agência:");
			this.agencia = entrada.next();
		}
		
		public void digitarNome() {
			Scanner entrada = new Scanner(System.in);
			System.out.print("Digite seu nome: ");
			this.nomeCliente = entrada.next();
		}
		
		public void mostrarSaldo() {
			System.out.println("Seu saldo é: " + this.saldo);
		}
		
		public void fazerDeposito(double valor) {
			this.saldo += valor;
			
			System.out.println("deposito realizado: " + valor);
		}
		
		public void fazerSaque(double valor) {
			if (this.saldo >= valor) {
			this.saldo -= valor;
			
			System.out.println("Saque realizado: " + valor);
		} else {
			System.out.println("Saldo insuficiente para saque");
		}
		}
		public void fazerTransferencia(Conta destino, double valor) {
			if(this.saldo >= valor) {
		   this.fazerSaque(valor); 
		   destino.fazerDeposito(valor);
		   System.out.println("Transferência realizada: " + valor);
	       
			} else {
				System.out.println("Saldo insuficiente para transferência");
			}
		}

		
	
	  
      public static void main(String[] args) {
	
       ContaPoupança conta1 = new ContaPoupança();
       
       conta1.adicionarNumero();
	   conta1.adicionarAgencia();
       conta1.digitarNome();
       conta1.fazerDeposito(50.0);
      conta1.fazerSaque(30.0);
       conta1.mostrarSaldo();
       
       
       ContaCorrente conta2 = new ContaCorrente();
  
       
       conta2.adicionarNumero();
       conta2.adicionarAgencia();
       conta2.digitarNome();
        conta2.fazerTransferencia(conta1, 30.0);
       conta1.mostrarSaldo();
       conta2.mostrarSaldo();
      
  
  
  







































      }   
}
