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
public class Ejecucion {
    public static void main(String[] arg){
        Banco Cuenta1 = new Banco(1012,1234,"Magdalena Sanchez",0);
        Cuenta1.Consignar_dinero(100000);
        Cuenta1.Consultar_saldo();
        Banco Cuenta2 = new Banco(1013,9876,"Joselito Perez",500000);
        Cuenta2.Consultar_saldo();
        Cuenta2.Cambiar_clave();
        Cuenta2.Retirar_dinero(100000);
        Cuenta2.Consultar_saldo();
    }
    
}
