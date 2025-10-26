import java.util.* ;
	class entrada {
		static Scanner sc = new Scanner ( System.in);

		public static int opcionElegida (int opcion) {
			System.out.println( " Elige una opcion : " );
			opcion=sc.nextInt();
			return opcion;
		}
				public static int alumnosElegidos (int opcion) {
			System.out.println( " Elige un numero de alumnos : " );
			opcion=sc.nextInt();
			return opcion;
		}
			public static float notaElegida (float opcion) {
			System.out.println( " Elige un nota : " );
			opcion=sc.nextFloat();
			return opcion;
		}
		public static float umbralElegido ( float umbral) {
			System.out.println ( " Elige un umbral : ");
			umbral=sc.nextFloat();
			return umbral;
		}
		public static String respuestaElegida ( String respuestaUsuario) {
			respuestaUsuario=sc.nextLine();
			return respuestaUsuario;

		}
	}
