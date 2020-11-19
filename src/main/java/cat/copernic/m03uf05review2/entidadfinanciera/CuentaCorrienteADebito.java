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
public class CuentaCorrienteADebito extends CuentaCorritenteImpl {

    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void abona(double abono) {
        double saldo = CuentaCorrienteADebito.super.getSaldo();


        if (saldo <= 0) {
            try {
                throw new Exception("No hay saldo");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else {
            CuentaCorrienteADebito.super.setSaldo(saldo - abono);
        }

    }
    
    @Override
    public void ingresa(double ingreso){
        
        double saldo = CuentaCorrienteADebito.super.getSaldo();
        
        if (ingreso > 3000) {
            try {
                throw new Exception("Se permite ingresar maximo 3000 por operación");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else {
            CuentaCorrienteADebito.super.setSaldo(saldo + ingreso);
        }   
    }    
}
    
