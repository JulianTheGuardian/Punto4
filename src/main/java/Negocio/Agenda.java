/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Negocio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Agenda {

    private static Contacto[] myContactos;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int tamanyo = 10;
        System.out.println("De cuanto tamaño sera la agenda?");
        try{
            tamanyo = input.nextInt();
        }catch(Exception e){
            System.out.println("Se produjo un error, el tamaño quedara por defecto(10)");
            tamanyo=10;
        }
        myContactos = new Contacto[tamanyo];
        
        String nombre;
        int numero;
        System.out.println("Llenando la agenda");
        for(int i = 0;i<tamanyo;i++){
            System.out.println("Nombre:");
            nombre = input.next();
            System.out.println("Numero:");
            numero = input.nextInt();
        }
        
        for(Contacto e:myContactos){
            System.out.println(e.toString());
        }
    }
}
