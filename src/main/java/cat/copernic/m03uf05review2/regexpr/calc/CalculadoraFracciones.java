/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

/**
 *
 * @author david
 */
public class CalculadoraFracciones {
    
    private fraccion operador1;
    
    private fraccion operador2;

    public CalculadoraFracciones(fraccion operador1, fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    //a/b + c/d = ((ad)+(bc) / (bd)
    public fraccion suma(){
        return new fraccion(operador1.getNumerador() * operador2.getDenominador() + operador1.getDenominador() * operador2.getNumerador(),
                operador1.getDenominador() * operador2.getDenominador());
    }
    
    public fraccion resta(){
        return new fraccion(operador1.getNumerador() * operador2.getDenominador() - operador1.getDenominador() * operador2.getNumerador(),
                operador1.getDenominador() * operador2.getDenominador());
    }
    
    public fraccion multiplicacion(){
        return new fraccion(operador1.getNumerador() * operador2.getNumerador(), operador1.getDenominador() * operador2.getDenominador());
    }
    
    public fraccion division(){
        return new fraccion(operador1.getNumerador() * operador2.getDenominador(), operador2.getNumerador() * operador1.getDenominador());
    }
    
    //maximo comun divisor
    private double mcd(double num1, double num2){
        while(num1 != num2){
            if(num1>num2){
                num1= num1-num2;
            }
            else{
                num2= num2 -num1;
            }
        }
        return num1;
    }
    
    private fraccion simplify(fraccion fraccion1){
        double mcd = mcd(fraccion1.getNumerador(), fraccion1.getDenominador());
        return new fraccion(fraccion1.getNumerador()/mcd, fraccion1.getDenominador()/mcd);
    }
}
