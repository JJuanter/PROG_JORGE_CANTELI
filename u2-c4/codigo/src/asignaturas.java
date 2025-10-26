import java.util.*;
	class asignaturas {
		static Scanner sc = new Scanner (System.in);
		static int numAlumnos;
		static float nota;
		static float media;
				public static float devolverMedia( float notitas, String asignatura ) {
						numAlumnos();
							notitas=hacerMedia();
							System.out.println ( " La nota media de " + asignatura + " es : " + notitas);
							return notitas;

				}
				private static void numAlumnos(){
			System.out.println( " Elige numero de alumnos : ");
			numAlumnos=sc.nextInt();
			while (numAlumnos < 1 || numAlumnos > 40) {
				numAlumnos = entrada.alumnosElegidos( numAlumnos); 

			}
				}
			private static float hacerMedia ( ) {
				int i = 0 ;
				media= 0;
				for ( i=0; i<numAlumnos;i++ ){
					System.out.println( " alumno " + (i + 1) + " : " );
					nota=sc.nextFloat();
								while (nota < 0 || nota > 10) {
				nota = entrada.notaElegida( nota); 
			
				}
					media += nota ;
				
					}
					return media / numAlumnos;
				}

			}

				
			

