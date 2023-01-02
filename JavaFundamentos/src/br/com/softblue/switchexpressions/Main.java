package br.com.softblue.switchexpressions;

public class Main{
	
	public enum DiaDaSemana{
		SEGUNDA,
		TERCA,
		QUARTA,
		QUINTA,
		SEXTA,
		SABADO,
		DOMINGO
	}
	
	public static void main(String[] args) {
		
		DiaDaSemana d = DiaDaSemana.QUARTA;
		
		switch (d) {		
			case SEGUNDA -> System.out.println(1);
			case TERCA -> System.out.println(2);
			default  -> System.out.println("outro");
		}
	}
}
