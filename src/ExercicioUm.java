
public class ExercicioUm {

	public static boolean ehDiaSemana(String dia) 
	{
		 if 
		 /*(dia == "domingo" || dia == "sabado")*/
		(dia.equalsIgnoreCase("domingo")|| 
			dia.equalsIgnoreCase("sabado"))
		{
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		boolean diaValido = ehDiaSemana("SABADO");
		System.out.println("É dia da semana:" + diaValido);
	}

}
