/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    public int numero;
    public int clave;
    public String dueño; 
    public int saldo;
    public void ConsignarDinero(int consigna){
    saldo = saldo + consigna;
    }
    public void RetirarDinero(int retiro){
    saldo = saldo - retiro
    }
    public void CambiarClave(){
    clave = system.in()
    }
    public void ConsultarSaldo(){}
    
}
