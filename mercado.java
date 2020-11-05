/*Este programa permite que el usuario haga su menu opciones de ventas y cobre segun la cantidad y el precio del articulo
y le de un pequeño descuento*/
//package com.company;
import java.util.Scanner;
public class mercado {
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