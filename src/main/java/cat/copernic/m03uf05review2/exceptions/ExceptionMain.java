/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pep
 *
 * Las exceptions derivadas de RuntimeException y las propia RuntimeException
 * son excepciones unchecked (no necesita try-catch). El resto sí.
 */
public class ExceptionMain {

    
    static double division(double a, double b) throws Exception {
        if (b == 0) {
            // chained (encadenadas) exceptions
            throw new Exception("denominador no puede ser 0", new IllegalArgumentException("argumento incorrecto", new IllegalAccessError()));
        }
        return a / b;
    }

    static String readFirstLineFromFile(String path) throws IOException {

        // try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }

    }

    public static void main(String[] args) {
        
        int[] a = {};
        a[0] = 0;
       
        try {
            //System.out.println(readFirstLineFromFile("data.txt"));
        } 
        catch(Exception e) {}
//        catch (IOException ex) {
//            ex.printStackTrace();
//            // Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally {
//            
//        }
                
   

    }

}         









/*
            double d = 0;
            try {
            d = division(5.0, 0.0);
            System.out.println(d);
            } catch (Exception ex) {
            Logger.getLogger(ExcreptionMain.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
            System.out.println("en finally");
            }
        */   
