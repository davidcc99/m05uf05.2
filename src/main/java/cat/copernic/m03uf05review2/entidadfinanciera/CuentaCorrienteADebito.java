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

    /**
     * 
     * Solamente se da un abono si hay saldo, si no se lanza una exception
     * 
     * @param abono 
     */
    @Override
    public void abona(double abono) {
        double saldoCuenta = CuentaCorrienteADebito.super.getSaldo();
        
        if(saldoCuenta > 0){
                saldoCuenta = saldoCuenta - abono;
        }
        else {
            try{
                throw new Exception("El saldo de la cuenta no puede ser negativo");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
