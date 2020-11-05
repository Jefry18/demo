



/*package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char vocal;
        System.out.println("Ingrese un caracter: ");
        vocal=entrada.next().charAt(0);
        switch (vocal){
            case 'a':
            case 'A':
                System.out.println("Anillo");
                System.out.println("Aro");
                System.out.println("Avion");
                break;
            case 'e':
            case 'E':
                System.out.println("Enano");
                System.out.println("Elefante");
                System.out.println("Escoba");
                break;
            case 'i':
            case 'I':
                System.out.println("Iglesia");
                System.out.println("Isla");
                System.out.println("Iman");
                break;
            case 'o':
            case 'O':
                System.out.println("Oso");
                System.out.println("Olla");
                System.out.println("Ojo");
                break;
            case 'u':
            case 'U':
                System.out.println("Uva");
                System.out.println("Uña");
                System.out.println("Uno");
                break;

            default:
                System.out.println("No es vocal");
        }
    }
}
*/
/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s=1;
        while(s!=2) {
            System.out.print("Tabla de multiplicar del 1 al 12");
            Scanner entrada = new Scanner(System.in);
            int n;
                if(n<0 || n>12){
                
            System.out.print("Introduce un número entero: ");
            n = entrada.nextInt();
            System.out.println("Tabla del " + n);
            for (int i = 1; i <= 12; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
            System.out.println("Desea visualizar otra tabla? ");
            System.out.println("1. Si");
            System.out.println("2. No");
            s = entrada.nextInt();
        }
    }
}*/

/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int s=1;
        while(s!=2) {
            Scanner entrada = new Scanner(System.in);
            int edad[] = new int[6];
            String nombres[] = new String[6];
            String falla[] = new String[6];

            for (int x = 0; x < 6; x++) {
                System.out.println("Ingrese nombre: ");
                nombres[x] = entrada.nextLine();
                System.out.println("Ingrese edad: ");
                edad[x] = entrada.nextInt();
                falla[x] = entrada.nextLine();
            }
            for (int y = 0; y < 6; y++) {
                System.out.println(nombres[y] + " Cuya edad es: " + edad[y] + " annios");
            }
            System.out.println("Desea repetir?");
            System.out.println("1. Si");
            System.out.println("2. No");
            s = entrada.nextInt();
        }
    }
}
 */
/*
package com.company;
import java.util.Scanner;
public class Main {
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
*/
/*
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner entrada= new Scanner(System.in);
        int precio[] = new int[3];
        String productos[] = new String[3];
        String falla[] = new String[3];
        System.out.println("Favor Ingrese 3 Productos & Precios: ");
        for(int x = 0; x < 3; x++){
            System.out.println("Producto #"+(x+1));
            productos[x] = entrada.nextLine();
            System.out.println("Precio #"+(x+1));
            precio[x] = entrada.nextInt();
            falla[x] = entrada.nextLine();
        }
        for(int y = 0; y < 3; y++){
            System.out.println((y+1)+"."+productos[y]+"   $"+precio[y]);
        }
        int opc=0;
        int s = 0;
        double total=0;
        int cantidad=0;
        int subtotal=0;
        while(s!=3) {
        System.out.println("Que desea comprar, solo puede escoger "+(3-s)+" productos por compra: ");
        opc = entrada.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Cuantos "+productos[0]+"?");
                    cantidad = entrada.nextInt();
                    subtotal=precio[0]*cantidad;
                    total=total+subtotal;
                    s++;
                    break;
                case 2:
                    System.out.println("Cuantos "+productos[1]+"?");
                    cantidad = entrada.nextInt();
                    subtotal=precio[1]*cantidad;
                    total=total+subtotal;
                    s++;
                    break;

                case 3:
                    System.out.println("Cuantos "+productos[2]+"?");
                    cantidad = entrada.nextInt();
                    subtotal=precio[2]*cantidad;
                    total=total+subtotal;
                    s++;
                    break;


                default:
                System.out.println("No esta en la opcion!");
            }
        }
        if(total>500){
            System.out.println("Tiene un descuento 10%");
            System.out.println("Su total es: L."+total+".00");
            System.out.println("Su total a pagar es: L."+(total-(total*0.10)));
        }else {
            System.out.println("Su total es: L." + total + ".00");
        }


    }
}
 */
/*
package com.company;
import java.util.Scanner;

public class Main {

        public static String saludar(String nombre)
        {
            //Se crea el mensaje de saludo
            String saludo = "Hola. Bienvenido " + nombre;

            return saludo;//Se retorna el saludo
        }

        public static String error(String nombre)
        {
            //Se crea el mensaje de error
            String error = "Ups. No pudimos validar tus datos. " + nombre + " es tu usuario?";

            return error; //Se retorna el error
        }

        public static void verificar(String usuario, String contrasenia)
        {
            String usuarioValido = "Juan";

            String contraseniaValida = "pass";

            //Se validan los datos
            if(usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia))
            {
                //Si son validos se llama ala función saludar y se muestra el mensaje retornado por pantalla
                System.out.println(saludar(usuario));
                return; //Terminamos la ejecución
            }
            //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
            System.out.println(error(usuario));
        }

        public static void main(String[] args)
        {
            String usuario = "Juan";
            String contrasenia = "pass";

            //Se hace la verificación
            verificar(usuario, contrasenia);

            //Mostrará el mensaje error.
        }
}
*/
/*
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int s=1;
        do {
            Scanner entrada = new Scanner(System.in);
            int valor;
            String tipo;
            System.out.println("Que conversion necesita hacer?");
            System.out.println("1. Masa (Kg-lb)");
            System.out.println("2. Distancia (Km-mi)");
            int opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuanto desea convertir?");
                    valor = entrada.nextInt();
                    System.out.println("Que desea convertir?");
                    System.out.println("1. Kg a Lb");
                    System.out.println("2. Lb a Kg");
                    opc = entrada.nextInt();
                    switch (opc) {
                        case 1:
                            tipo = "Lb";
                            masa(valor, tipo);
                            break;
                        case 2:
                            tipo = "Kg";
                            masa(valor, tipo);
                        default:
                           // System.out.println("No existe");
                    }
                    break;
                case 2:
                    System.out.println("Cuanto desea convertir?");
                    valor = entrada.nextInt();
                    System.out.println("Que desea convertir?");
                    System.out.println("1. Km a Mi");
                    System.out.println("2. Mi a Km");
                    opc = entrada.nextInt();
                    switch (opc) {
                        case 1:
                            tipo = "Mi";
                            distancia(valor, tipo);
                            break;
                        case 2:
                            tipo = "Km";
                            distancia(valor, tipo);
                        default:
                         //   System.out.println("No existe");
                    }
                    break;
                default:
                    System.out.println("No existe");
            }
            System.out.println("Desea repetir?");
            System.out.println("1. Si");
            System.out.println("2. No");
            s = entrada.nextInt();
        }while (s!=2);
    }

    public static void masa(int a, String b) {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        if(b=="Lb") {
            resultado = a / 2.2;
            System.out.println("Se ha convertido: " + a + " kg a " + resultado +" "+ b);
        }else{
            resultado = a * 2.2;
            System.out.println("Se ha convertido: "+a+" Lb a "+ resultado +" "+ b);
        }
    }

    public static void distancia(int c, String d) {
        Scanner entrada = new Scanner(System.in);
        double resultado;
        if(d=="Mi") {
            resultado = c / 1.60934;
            System.out.println("Se ha convertido: " + c + " Km a " + resultado +" "+ d);
        }else{
            resultado = c * 1.60934;
            System.out.println("Se ha convertido: "+c+" Mi a "+ resultado +" "+ d);
        }
    }
*/

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        public static void menu () {
            int opc;
            System.out.println("1. Masa (Kg-lb)");
            System.out.println("2. Distancia (Km-mi)");
            int opc = entrada.nextInt();
        }
        public static  double decimal (Scanner entrada){
            System.out.println("Ingrese un numero:");
            double dato = entrada.nextDouble();
            
            return dato;
        }
        public static int entero (Scanner entrada){

            int entero = entrada.nextInt();

            return entero;
        }
        public static String texto () {
            String texto = entrada.nextLine();

            return texto;
        }
    }

}