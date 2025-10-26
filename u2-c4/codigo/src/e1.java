import java.util.* ;

	class e1 {
		static int opcion;
		static float umbral = 5;
		static String grupo= "daw1-a";
		public static void main ( String [ ] args) {
			do {
				System.out.println( " Grupo actual: " + grupo);

				System.out.println( " 0.Salir \n 1.Cambiar nombre del grupo \n 2.Listar asignaturas con notas medias \n 3.Calcular media \n 4.Consultar estadisticas generales \n 5.Cambiar umbral de aprobado: " + configuracion.umbral + "\n 6.Restablecer todas las notas");

				pedirOpcion();
				switch (opcion) {
					case 1 -> { 
					grupo=datosGrupo.cambiarNombre();
					}
					case 2 -> {
					datosGrupo.mostrarAsignaturas();
					}
					case 3 -> {
					datosGrupo.calcularMedia();
					}
					case 4 -> {
					datosGrupo.mostrarEstadisticas();
					}
					case 5 -> {
					configuracion.cambiarUmbral();
					}
					case 6 -> {
					datosGrupo.reiniciarNotas();
					}
			}

			}	while ( opcion!=0);

		}
		private static void pedirOpcion() {
			Scanner sc = new Scanner ( System.in) ;
			System.out.println( " Elige una opcion : ");
			opcion=sc.nextInt();
			while (opcion < 0 || opcion > 6) {
				opcion = entrada.opcionElegida( opcion); 

			}
		}
}
