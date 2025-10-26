import java.util.Scanner;
	class datosGrupo {
		static String nombreGrupo = "daw1-a";
		static float programacion = -1;
		static float bases = -1;
		static float lenguajes= -1;
		static float entornos = -1;
		static float sistemas = -1;
		static int opcion;
		static String aprobado;
		static float mediaGlobal;
		static float notaMayor;
		static String asignaturaMayor;
		static String asignaturaPeor;
		static float notaMenor;
		static boolean confirmacion;
		static String respuestaUsuario;
		static Scanner sc = new Scanner ( System.in);

		public static String cambiarNombre( ) { /* Se pone publico porque se llama desde la clase E1 */
			System.out.println( " Introduce el nuevo nombre del grupo : "); 
			nombreGrupo= sc.nextLine();
			return nombreGrupo;		/* Siempre que haya una funcion que devuelve algo ( que sea string o int) se pone return */
		}
		public static void mostrarAsignaturas ( ) {
			System.out.println( " haz elegido mostrarAsignatura" );
			listarAsignatura( " Programación " , programacion);
			listarAsignatura( " Bases de datos" , bases);
			listarAsignatura ( " Lenguajes ", lenguajes);
			listarAsignatura ( " Entornos desarrollo ", entornos);
			listarAsignatura ( "  Sistemas ", sistemas);

		}
		private static void listarAsignatura ( String nombreAsignatura, float notaAsignatura) {
			if ( notaAsignatura == -1){
				System.out.println(  nombreAsignatura +" : sin datos ");
			}
			else {
				aprobado=configuracion.comprobarAprobado( notaAsignatura);
					System.out.println ( " La asignatura es : " + nombreAsignatura + " Y la media es : " + notaAsignatura + " y la nota : " + aprobado);
			}



		}
		public static void calcularMedia ( ) {

					System.out.println( "  1.Programacion \n 2.bases \n 3.lenguajes \n 4.entornos \n 5.sistemas" );
					opcion = pedirOpcion();
	
				switch (opcion) {
					case 1 -> { 
					programacion=asignaturas.devolverMedia(programacion, "Programacion");
					}
					case 2 -> {
					bases=asignaturas.devolverMedia( bases, " Bases de datos");
					}
					case 3 -> {
					lenguajes=asignaturas.devolverMedia(lenguajes ,"Lenguajes");
					}
					case 4 -> {
					entornos=asignaturas.devolverMedia( entornos, " Entornos desarrollo");
					} 
					case 5 -> {
					sistemas=asignaturas.devolverMedia(sistemas, " Sistemas");
					} 
				}
			}

		
		private static int pedirOpcion() {
			System.out.println( " Elige una opcion : ");
			opcion=sc.nextInt();
			while (opcion < 1 || opcion > 5) {
				opcion = entrada.opcionElegida( opcion); 

			}
			return opcion;
		}
		public static void mostrarEstadisticas () {
			if ( programacion == -1 || bases == -1 || entornos == -1 || lenguajes == -1 || sistemas == -1) {
				System.out.println ( " No hay datos suficientes para hacer la operacion..");
			}
			else {


			mediaGlobal = (programacion + bases + entornos + lenguajes + sistemas) / 5 ;
			System.out.println ( " La media global es : " + mediaGlobal);

			notaMayor = programacion;
			asignaturaMayor = "Programacion";

			if ( bases > notaMayor){
				notaMayor = bases;
				asignaturaMayor = "Bases";
			}
			if ( lenguajes > notaMayor){
				notaMayor = lenguajes;
				asignaturaMayor = "Lenguajes";
			}
			if ( entornos > notaMayor){
				notaMayor = entornos;
				asignaturaMayor = "entornos";
			}
			if ( sistemas > notaMayor){
				notaMayor = sistemas;
				asignaturaMayor = "sistemas";
			}
			System.out.println ( " la mejor asignatura es : " + asignaturaMayor + " Y la media es : " + notaMayor);

		
					notaMenor = programacion;
			asignaturaPeor = "Programacion";

			if ( bases < notaMenor){
				notaMenor = bases;
				asignaturaPeor = "Bases";
			}
			if ( lenguajes < notaMenor){
				notaMenor = lenguajes;
				asignaturaPeor = "Lenguajes";
			}
			if ( entornos < notaMenor){
				notaMenor = entornos;
				asignaturaPeor = "entornos";
			}
			if ( sistemas < notaMenor){
				notaMenor = sistemas;
				asignaturaPeor = "sistemas";
			}
			System.out.println ( " la peor asignatura es : " + asignaturaPeor + " Y la media es : " + notaMenor);
		}
	}
		public static void reiniciarNotas(  ) {
			System.out.println( " Estas seguro de hacer la operacion ? : ( S/N) " );
			respuestaUsuario = sc.nextLine();
			while (!respuestaUsuario.equalsIgnoreCase("S") && !respuestaUsuario.equalsIgnoreCase("N")){
				respuestaUsuario = entrada.respuestaElegida( respuestaUsuario);
			}
			if ( respuestaUsuario.equalsIgnoreCase ("S")){
				programacion=configuracion.devolverMenosuno( programacion);
				bases=configuracion.devolverMenosuno( bases);
				lenguajes=configuracion.devolverMenosuno( lenguajes);
				entornos=configuracion.devolverMenosuno( entornos);
				sistemas=configuracion.devolverMenosuno( sistemas);
				System.out.println ( " El reinicio se realizo con exito.");

			}
			else {
				System.out.println( " La operacion fue cancelada.");
			}



		}

		}
	
