
public class ExercicioDois {
	
	public static boolean possoIrBanco(String dia, int hora) {
		if  (ExercicioUm.ehDiaSemana(dia) && hora >= 10 && hora <= 16) {
			 return true;
			
		} else {
			return false;

		}
	}	

	public static void main(String[] args) {
		boolean diaValido = possoIrBanco("segunda", 17);
		System.out.println("O banco esta aberto? Resp: " + diaValido);
		
	}
	
	
	
}
