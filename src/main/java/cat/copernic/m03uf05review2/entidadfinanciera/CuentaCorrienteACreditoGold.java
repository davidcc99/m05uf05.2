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

    /**
     * Esta cuenta permite una descubierto de hasta 3000 €, si es más
     * lanza una exception
     * 
     * @param abono 
     */
    @Override
    public void abona(double abono) {
        double saldoCuenta = CuentaCorrienteACreditoGold.super.getSaldo();
        
        
        if(saldoCuenta > -3000){
                saldoCuenta = saldoCuenta - abono;
        }
        else {
            try{
                throw new Exception("El saldo de la cuenta no puede pasar de los -3000 negativos");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
