/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        int condicion;
        int aux;
        
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine(); // Limpiar el Scanner para trabajar con otro tipo de dato (int a String)

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }
        
       
        
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);

        System.out.println("Desea ingresar su sueldo semanal o mensual?\n");
        System.out.println("1. Semanal");
        System.out.println("2. Semanal (arreglo)");
        System.out.println("3. Mensual");
        condicion = scanner.nextInt();
        
        if(condicion==1){
            System.out.println("Ingrese sueldo de la semana 1");
            double sueldo1=scanner.nextDouble();          
            System.out.println("Ingrese sueldo de la semana 2");
            double sueldo2=scanner.nextDouble();
            System.out.println("Ingrese sueldo de la semana 3");
            double sueldo3=scanner.nextDouble();
            System.out.println("Ingrese sueldo de la semana 4");
            double sueldo4=scanner.nextDouble();
            t.agregar_sueldo(sueldo1, sueldo2, sueldo3, sueldo4);
        }
        if (condicion==2){
            double sueldos[]=new double [4];
            for(int i=0;i<4;i++){
                
                // System.out.println("Ingrese sueldo de la semana "+i+1);
                System.out.printf("Ingrese sueldo de la semana %d", i+1);
                sueldos[i]=scanner.nextDouble();
                
            }
            t.agregar_sueldo(sueldos);
        }
        
        if(condicion==3){
                       
            System.out.println("Ingrese el sueldo del trabajador");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        }
        
        System.out.printf("Los datos del trabajador son: %s\n", t);
        
    }
}
