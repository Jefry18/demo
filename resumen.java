/*Este programa pide al usuario que ingrese el nombre del alumno y 4 asignaturas con sus notas finales
y asi sacar el promedio, para visualizarlo y visualizar su nota de la clase mas alta*/
//package com.company;
import java.util.Scanner;
public class resumen {
    public static void main(String args[]) {
        Scanner entrada= new Scanner(System.in);
        int nota[] = new int[4];
        int nmayor = 0;
        String amayor = new String();
        String fa = new String();
        String asignaturas[] = new String[4];
        String nombre;
        String falla[] = new String[4];
        int s = 1;
        while(s!=2) {
            System.out.println("===Este programa es acerca de PROMEDIOS===");
            System.out.println("===Favor ingrese el nombre de Alumno a Promediar===");
                System.out.println("Nombre del Alumno: ");
                nombre = entrada.nextLine();
                for (int y = 0; y < 4; y++) {
                    System.out.println("Asignatura  #" + (y + 1) + ":");
                    asignaturas[y] = entrada.nextLine();
                    System.out.println("Nota #" + (y + 1) + ":");
                    nota[y] = entrada.nextInt();
                    falla[y] = entrada.nextLine();
                        if(nota[y]>nmayor){
                            nmayor=nota[y];
                            amayor= asignaturas[y];
                        }
                }
            double promedio;
            promedio=(nota[0]+nota[1]+nota[2]+nota[3])/4;
            System.out.println("Promedio del alumno:"+nombre+" es:"+promedio+"%");
            System.out.println("Su nota mas alta es en la clase: "+amayor+" con la nota de: "+nmayor+"%");
            System.out.println("Desea repetir?");
            System.out.println("1. Si");
            System.out.println("2. No");
            s = entrada.nextInt();
            fa = entrada.nextLine();
        }


    }
}