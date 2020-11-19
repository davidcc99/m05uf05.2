/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

/**
 *
 * @author pep
 */
public class CuentaCorrienteACreditoPlatinum extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoPlatinum(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void abona(double abono) {
        double saldo = CuentaCorrienteACreditoPlatinum.super.getSaldo();


        if (saldo <= -5000) {
            try {
                throw new Exception("El descubierto máximo es de 5000");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else {
            CuentaCorrienteACreditoPlatinum.super.setSaldo(saldo - abono);
        }

    }
    
    @Override
    public void ingresa(double ingreso){
        
        double saldo = CuentaCorrienteACreditoPlatinum.super.getSaldo();
        
        if (ingreso > 10000) {
            try {
                throw new Exception("Se permite ingresar maximo 10000 por operación");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else {
            CuentaCorrienteACreditoPlatinum.super.setSaldo(saldo + ingreso);
        }
        
    }

}
