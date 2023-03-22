package boletimEscolar;
import java.util.Scanner;



public class Boletim {

	public static void main(String[] args) {
		
		String resposta;
		Scanner entrada = new Scanner(System.in);
		Notas listaNotas = new Notas();
		String notaaa ;
		
	
		
		
		System.out.println("Voce deseja saber se esta aprovado ou reprovado? Digite 'Sim', se quiser.");
		resposta = entrada.next();
		
		if(resposta.equalsIgnoreCase("Sim")) {
		
			System.out.println("Entao vamos comecar! \n ");
			System.out.println("Digite sua primeira nota. Se a nota nao for um numero inteiro, digite com virgula :)... \nExemplo: 8,5  \n");
			listaNotas.notas.add(0, entrada.nextDouble());
			System.out.printf("A primeira nota digitada foi... " + listaNotas.notas.get(0));
		}
		else {
			System.out.println("Fechando o programa...");
		}
		
			
			
	
			
			
		
			
			
			
		
		
		
		
		

	}
}


