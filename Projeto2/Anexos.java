package Empresa2;

import java.util.Scanner;
public class Anexos {

		public static void main (String args[]) {
			
			
			Scanner ler = new Scanner(System.in);
			
			int x = 0, y=0;
			
			System.out.println("Ol� empres�rio!\n\n"
					+ "Bem vindo! Vamos planejar seu futuro?\n"
					+ "Como posso te ajudar hoje?\n"
					+ "\n1 - Planejamento tribut�rio e trabalhista"
					+ "\n"
					+ "2 - Informa��es\r\n"
					 );
			x = ler.nextInt();
			
			while(x>0 && x<=2) {
			if (x==2) {
				
				System.out.println("\nQual a atividade da sua empresa? (Escolha um n�mero)\n"
						+"\n1 - Anexo I - Com�rcio\n2 - Anexo II - Ind�stria\n3 - AnexoIII - Servi�o\n4 - Anexo IV - Constru��o civil\n5 - Anexo V - Servi�os de cunho intelectual\n");
				y = ler.nextInt();
			}
			
			String lista[] = {"\nAnexoI\n"
								+ "","\nAnexoII\n"
									+ "","\nAnexoIII \n"
										+ "","\nAnexo IV\n"
											+ "","\nAnexoV" };
							
					System.out.println(lista[y-1]);
			} }
		
}
