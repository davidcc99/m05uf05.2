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
public class CuentaCorrienteACreditoGold extends CuentaCorrienteACredito {

    public CuentaCorrienteACreditoGold(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void abona(double abono) {
        double saldo = CuentaCorrienteACreditoGold.super.getSaldo();


        if (saldo <= -3000) {
            try {
                throw new Exception("El descubierto máximo es de 3000");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else {
            CuentaCorrienteACreditoGold.super.setSaldo(saldo - abono);
        }

    }
    
    @Override
    public void ingresa(double ingreso){
        
        double saldo = CuentaCorrienteACreditoGold.super.getSaldo();
        
        if (ingreso > 5000) {
            try {
                throw new Exception("Se permite ingresar maximo 5000 por operación");
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        } 
        else {
            CuentaCorrienteACreditoGold.super.setSaldo(saldo + ingreso);
        }
        
    }
    
}
