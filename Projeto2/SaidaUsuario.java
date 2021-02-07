package empresa;

import java.util.List;

public class SaidaUsuario {
	//static Scanner = new Sc
	public static void qualAnexo() {
		String menuAnexo = "1- Anexo I - Com�rcio\r\n"
				  + "2- Anexo II - Industria\r\n"
				  + "3- Anexo III - Servi�o\r\n"
				  + "4- Anexo IV � Constru��o Civil\r\n"
				  + "5- Anexo  V �� Servi�os de cunho intelectual\r\n";
		System.out.println(menuAnexo);
	}
	
	public static void relatorio(List<Float> pagamento, float total, float imposto) {
		for (int i = 0; i <= 11; i++) {
			System.out.printf("Faturamento mes %d foi de: %.2f\n", i+1, pagamento.get(i) );	
		}
		System.out.println("\nSeu faturamento total dos ultimos 12 meses foi de: "+total + " reais");
		System.out.println("\nSeu imposto do m�s � de: "+imposto + " reais");
		
		if (total < 0)
		{
			System.out.println("Erro! O sistema n�o aceita valores negativos! Tente novamente");			
		}
		

		else if (pagamento.get(11)<=0)
		{
			System.out.printf("\nN�o houve faturamento nesse m�s. Voc� n�o ter� imposto � pagar!");
		}
		else if (total > 4800000)
		{
			System.out.printf("\nUhul! Parece que voc� est� voando!!! \r\n"
					+ " Voc� excedeu seu limite de faturamento para o Simples Nacional. Fique atento e converse com seu contador!  Pois precisa se enquadrar direitinho!\r\n"
					+ "");
		}
		else if (total <=81000)
		{
			System.out.printf("\nUhul! Parece que voc� est� crescendo!!! \r\n"
					+ " Mas sabia que talvez voc� esteja pagando mais imposto do que deveria?! Converse com seu contador, pois voc� pode ser um Microempreendedor individual e pagar menos imposto! ");
		}
		
		
		

	}
	
}