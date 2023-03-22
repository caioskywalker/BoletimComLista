package boletimEscolar;
import java.util.Scanner;
/**
 * 
 * @author caiof
 *  Ao invés de criar uma variável para cada nota inserida no console,
 *  eu preferi trabalhar com uma lista e inserir as notas dentro de um único
 *  objeto, no entanto ainda não tenho conhecimento para fazer
 *  a média dessas 4 notas dentro do objeto. 
 *  Nos próximos módulos voltarei a este projeto e farei uma versão
 *  mais enxuta do código.
 * 
 *
 */



public class Boletim {

	public static void main(String[] args) {
		
		String resposta;
		Scanner entrada = new Scanner(System.in);
		Notas listaNotas = new Notas();
		
		
		System.out.println("Voce deseja saber se esta aprovado ou reprovado? Digite 'Sim', se quiser.");
		resposta = entrada.next();
		
		if(resposta.equalsIgnoreCase("Sim")) {
		
			System.out.println("Entao vamos comecar! Você digitará 4 notas. \n ");
			
			for(int i = 0 ; i < 4 ; i++) {
			System.out.println("Digite sua nota. Se a nota nao for um numero inteiro, digite com virgula :)... \nExemplo: 8,5  \n");
			listaNotas.notas.add(i, entrada.nextDouble());
			System.out.printf("A nota digitada foi... " + listaNotas.notas.get(i) + ". \n");
			}
		}
		
		
		else {
			System.out.println("Programa finalizado...");
				
		}
		
		
		if(resposta.equalsIgnoreCase("Sim")) {
		
			entrada.close();
		
			System.out.println("Agora vamos calcular sua media e saber se voce esta aprovado... \n");
			System.out.println("Suas notas são: \n " + listaNotas.notas + ". \n");
		
			Double nota1 = listaNotas.notas.get(0);
			Double nota2 = listaNotas.notas.get(1);
			Double nota3 = listaNotas.notas.get(2);
			Double nota4 = listaNotas.notas.get(3);
			
			Double soma = nota1 + nota2 + nota3 + nota4;
			Double mediaSoma = soma /4;
	
			
			if(mediaSoma >= 7) {
				System.out.printf("Sua média e: " + mediaSoma + ". Voce está aprovado" );
			}
			
			else if(mediaSoma >= 5  ) {
				System.out.println("Sua média e: " + mediaSoma + ". Voce está de recuperacao." );
				
			}
			else {
				System.out.println("Sua media e: " + mediaSoma + ". Voce esta reprovado.");
			}
		}
				
		
		
		
		
		
		
		
		
			
			
	
			
			
		
			
			
			
		
		
		
		
		

	}
}


