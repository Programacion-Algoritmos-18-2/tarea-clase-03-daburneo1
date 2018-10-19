/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

/**
 *
 * @author David
 */
public class Trabajador {
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;
    
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){
        nombres = String.format("%s-%s", n1, n2);
    }
    
    
    public void agregar_sueldo(double sueldo){
        sueldo_mensual = sueldo;
    }
    
    public void agregar_sueldo(double sueldo1, double sueldo2, double sueldo3, double sueldo4){
        sueldo_mensual=sueldo1+sueldo2+sueldo3+sueldo4;
    }
    
     public void agregar_sueldo(double [] sueldos){
         
         double resultado=0;
         for(int i=0;i<4;i++){   
            resultado=resultado+sueldos[i];
         }
         sueldo_mensual=resultado;
        
    }
    
        
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
    }
    
    @Override
    public String toString(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    
}