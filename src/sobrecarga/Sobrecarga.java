/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author ADMIN
 */
public class Sobrecarga {

    int num1;
    int num2;
    
    public void metodosobrecargado(){
        
        System.out.println("Método sobrecargado sin argumentos");
    }
    
    public void metodosobrecargado(int num1){
    
        System.out.println("Método sobrecargado con 1 argumento : " + num1);
    }

    
    public void metodosobrecargado(int num1, int num2){
    
        System.out.println("Método sobrecargado con 2 argumentos : " + num1 + " " + num2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sobrecarga obj1 = new Sobrecarga();
        
        obj1.metodosobrecargado();
        obj1.metodosobrecargado(4);
        obj1.metodosobrecargado(4, 8);
    }
    
}
