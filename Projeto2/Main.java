package empresa;

import java.util.InputMismatchException;


public class Main {
	public int getAnexo() {
		int anexo= 0;
		SaidaUsuario.qualAnexo();
		try {
			anexo = EntradaUsuario.getInt();
			while(anexo < 1 || anexo >5 ) {
				System.out.println("Por favor digite um valor v�lido, atente-se ao menu: ");
				SaidaUsuario.qualAnexo();
				anexo = EntradaUsuario.getInt();
			}
			
		}catch (InputMismatchException e) {
			System.out.println("Voc� digitou uma entrada inv�lida, por favor tente novamente!\nErro: "+e);
			return this.getAnexo();
		}
		catch(NumberFormatException ne) {
			System.out.println("Voc� digitou uma entrada inv�lida, por favor tente novamente!\nErro: "+ne);
			return this.getAnexo();
		}
		return anexo;
	}
	
	public void execucaoPrograma() {
		// TODO Auto-generated constructor stub
		int anexo;
		
		System.out.println("Ol� empres�rio! Bem vindo! Vamos planejar seu futuro?\n");
		System.out.println("Qual a atividade da sua empresa? (Escolha um n�mero): ");
		
		System.out.println("Digite o nome da empresa");
		String nome= EntradaUsuario.getString();
		
		System.out.println("Digite o CNPJ da empresa");
		String cnpj= EntradaUsuario.getString();
		
		
		
		int opMenu = SaidaUsuario.menuInicial();
		
		switch (opMenu) {
		
			case 1: {
					
				anexo = this.getAnexo();
				System.out.println(anexo);
				switch (anexo) {
					case 1: {
						//chama a classe do case 1
						System.out.println("Voce digitou 1");
						EmpresaTest emp = new EmpresaTest();
						emp.run();
						break;
					}
					case 2:{
						Anexo2Industria emp = new Anexo2Industria();
						emp.run();
						break;
					}
					default:
						System.out.println("Saindo do programa");
						break;
				}
				
	
			}
				
		    case 2: {
		    	
		    	
		    	 int continua;
		    	 
		    	 do {
		    		 int anexos = getAnexo();
		    		 
		    		 System.out.println(SaidaUsuario.informacoes(anexos));
		    		 System.out.println("Digite 1 se deseja ver informa��es de outros anexos.");
		    		 
		    		 try {
		    		 continua= EntradaUsuario.getInt();
		    		 } 
		    		 catch (Exception e) {
		    			 System.out.println("ERRO: Op��o inv�lida");
		    			 continua=0;
		    		 }
		    	 } while (continua==1);
		    	 
		    	 
		    	 
		    	
		    	 
		    }
		}
		
		
		
		
		}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.execucaoPrograma();
	}
}