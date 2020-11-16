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

    /**
     * Esta cuenta permite una descubierto de hasta 5000 €, si es más lanza una
     * exception
     *
     * @param abono
     */
    @Override
    public void abona(double abono) {
        double saldoCuenta = CuentaCorrienteACreditoPlatinum.super.getSaldo();
        
        
        if(saldoCuenta > -5000){
                saldoCuenta = saldoCuenta - abono;
        }
        else {
            try{
                throw new Exception("El saldo de la cuenta no puede pasar de los -5000 negativos");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
