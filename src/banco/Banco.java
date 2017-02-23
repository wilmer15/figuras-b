/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Acer
 */
public class Banco {
    
    public Banco(int nc, int cla, String nom, int sal){
        Numero_Cuenta=nc;
        Clave_acceso=cla;
        Dueno_cuenta=nom;
        saldo=sal;
    }
    private int Numero_Cuenta;
    private int Clave_acceso;
    private String Dueno_cuenta;
    private int saldo;
    java.util.Scanner entrada = new java.util.Scanner(System.in);
    
    public void Consignar_dinero(int valor){
        saldo+=valor;
        System.out.println("Su Consignacion fue de " + valor + " Y su nuevo saldo es de: " + saldo);
    }
    public void Retirar_dinero(int valor){
        saldo-=valor;
        System.out.println("Su retiro fue de " + valor + " Y su nuevo saldo es de: " + saldo);
    }
    public void Cambiar_clave(){
        int clave =0;
        while(!(clave==Clave_acceso)){
         System.out.println("Digite la Clave Anterior");
         clave = entrada.nextInt();
        }
        System.out.println("Digite su nueva clave");
        Clave_acceso= entrada.nextInt();
        System.out.println("Su nueva clave es " + Clave_acceso);  
    }
    public void Consultar_saldo(){
        System.out.println("El saldo de la cuenta No " + Numero_Cuenta + " Con Titular " + Dueno_cuenta + " es de " + saldo);  
    }
    
            
    
}
