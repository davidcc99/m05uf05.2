/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class CuentaCorrienteADebitoTest {
    
    public CuentaCorrienteADebitoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
   @org.junit.Test
    public void testAbona() {
        CuentaCorrienteADebito cuenta1 = new CuentaCorrienteADebito("David Castellón", 200);
        double sacar = 200.0;
        double restarAbono = cuenta1.getSaldo() - sacar;
        //assertTrue(restarAbono >= 0);
        
    }
    
}
