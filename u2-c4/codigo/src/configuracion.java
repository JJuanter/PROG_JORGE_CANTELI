import java.util.* ;

class configuracion {
	public static float umbral = 5;
	static float sindatos = -1;


	public static String comprobarAprobado ( float nota ) {
		if ( nota >= umbral) {
			return " esta aprobada ";
		}
		return " Está suspenso.";
	}
	public static void cambiarUmbral ( ) {
		System.out.println( " Dime el nuevo umbral : " );
		Scanner sc = new Scanner ( System.in) ;
		umbral=sc.nextFloat();
		while ( umbral < 0 || umbral > 10) {
			umbral = entrada.umbralElegido(umbral);
		}
	}
	public static float devolverMenosuno (float nota ) {
			nota = -1;
			return nota;
	}


}