/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3eraunidaddoble;


public class Listas {
     public Nodo inicio, fin, inicio1, fin1, inicio2, fin2, inicio3, fin3;
    public Nodo mayus, minus, nums, esp;
    char n;
    public void Insertar(char a){
        char c = 65;
        while(c <= 90){
            if(a == c){
                inicio = mayus = new Nodo(a, inicio);
                a = 0;
                Nodo fijarfin = inicio;
                while(fijarfin.siguiente != null){
                fijarfin = fijarfin.siguiente;
                }
                fin = fijarfin;
                fin.siguiente = null;
                
            }
            c++;
        }
        c = 97;
        while(c <= 122){
            if(a == c){
                inicio1 = minus = new Nodo(a, inicio1);
                a = 0;
                Nodo fijarfin = inicio1;
        while(fijarfin.siguiente != null){
            fijarfin = fijarfin.siguiente;
        }
        fin1 = fijarfin;
        fin1.siguiente = null;
            }
            c++;
        }
        c = 48;
        while(c <= 57){
            if(a == c){
                inicio2 = nums = new Nodo(a, inicio2);
                a = 0;
                Nodo fijarfin = inicio2;
        while(fijarfin.siguiente != null){
            fijarfin = fijarfin.siguiente;
        }
        fin2 = fijarfin;
        fin2.siguiente = null;
            }
            c++;
        }
        if(a != 0){
            inicio3 = esp = new Nodo(a, inicio3);
            Nodo fijarfin = inicio3;
        while(fijarfin.siguiente != null){
            fijarfin = fijarfin.siguiente;
        }
        fin3 = fijarfin;
        fin3.siguiente = null;
        }
    }
    public void Ordenar(){
        if (inicio != null) {
            Nodo orden = inicio;
            Nodo sig;
            char aux = 0;
            while(orden != fin){
                sig = orden.siguiente;
                while (sig != null) {
                    if (orden.dato > sig.dato) {
                        aux= orden.dato;
                        orden.dato = sig.dato;
                        sig.dato = aux;
                    }
                    sig = sig.siguiente;
                }
            orden = orden.siguiente;
            }
        }
        if (inicio1 != null) {
            Nodo orden = inicio1;
            Nodo sig;
            char aux = 0;
            while(orden != fin1){
                sig = orden.siguiente;
                while (sig != null) {
                    if (orden.dato > sig.dato) {
                        aux= orden.dato;
                        orden.dato = sig.dato;
                        sig.dato = aux;
                    }
                    sig = sig.siguiente;
                }
            orden = orden.siguiente;
            }
        }
        if (inicio2 != null) {
            Nodo orden = inicio2;
            Nodo sig;
            char aux = 0;
            while(orden != fin2){
                sig = orden.siguiente;
                while (sig != null) {
                    if (orden.dato > sig.dato) {
                        aux= orden.dato;
                        orden.dato = sig.dato;
                        sig.dato = aux;
                    }
                    sig = sig.siguiente;
                }
            orden = orden.siguiente;
            }
        }
        if (inicio3 != null) {
            Nodo orden = inicio3;
            Nodo sig;
            char aux = 0;
            while(orden != fin3){
                sig = orden.siguiente;
                while (sig != null) {
                    if (orden.dato > sig.dato) {
                        aux= orden.dato;
                        orden.dato = sig.dato;
                        sig.dato = aux;
                    }
                    sig = sig.siguiente;
                }
            orden = orden.siguiente;
            }
        }
    }
    public void Mostrar(){
        Ordenar();
	if (inicio != null || inicio1 != null || inicio2 != null || inicio3 != null) {					
            Nodo recorrer=inicio;
            System.out.print("Mayusculas: ");
            while(recorrer != null){
                System.out.print(recorrer.dato + "  ");
                recorrer = recorrer.siguiente;
            }
            System.out.println();
            recorrer = inicio1;
            System.out.print("Minusculas: ");
            while(recorrer != null){			
                System.out.print(recorrer.dato+"  ");
                recorrer = recorrer.siguiente;
            }
            System.out.println();
            recorrer = inicio2;
            System.out.print("Numeros: ");
            while(recorrer != null){
                System.out.print(recorrer.dato+"  ");
                recorrer = recorrer.siguiente;
            }
            System.out.println();
            recorrer = inicio3;
            System.out.print("Especiales: ");
            while(recorrer != null){
                System.out.print(recorrer.dato+"  ");
                recorrer = recorrer.siguiente;
            }
            System.out.println();
        }else{
            System.out.println("La lista esta vacia");
        }
        System.out.println();
    }
}
