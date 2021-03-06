/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.entidadfinanciera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class CuentaCorrienteADebitoTest {
    
    private CuentaCorrienteADebito instance;
    
    public CuentaCorrienteADebitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CuentaCorrienteADebito("David", 500.00);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito
     */
    @Test
    public void testAbona() {
        double abono = 200.0;
        //double abono = 600.0;
        instance.abona(abono);
        
        assertEquals(300.00, instance.getSaldo(), 0.01);
        //assertEquals(-100.00, instance.getSaldo(), 0.01);
    }

    /**
     * Test of ingresa method, of class CuentaCorrienteADebito
     */
    @Test
    public void testIngresa() {
        
        double ingreso = 1000.0;
        //double ingreso = 3100.0;
        instance.ingresa(ingreso);
        assertEquals(1500.00, instance.getSaldo(), 0.01);
        //assertEquals(3600.00, instance.getSaldo(), 0.01);
        
    }
    
}
