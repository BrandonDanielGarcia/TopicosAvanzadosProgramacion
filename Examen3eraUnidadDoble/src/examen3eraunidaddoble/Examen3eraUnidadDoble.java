package examen3eraunidaddoble;

import java.util.Scanner;

public class Examen3eraUnidadDoble {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Listas list = new Listas();
        Scanner entrada = new Scanner(System.in);
        int opc;
        char dato;
        do{
            System.out.println("Menu");
            System.out.println("1. Mostrar elementos");
            System.out.println("2. Agregar un elemento");
            System.out.println("3. Salir");
            opc = entrada.nextInt();
            switch(opc){
                case 1: list.Mostrar();
                break;
                case 2:System.out.println("Ingrese un elemento"); 
                dato = entrada.next().charAt(0);
                    list.Insertar(dato);
                break;
                default: System.out.println("Opcion incorrecta");
            }
        }while(opc !=3);
    }
}