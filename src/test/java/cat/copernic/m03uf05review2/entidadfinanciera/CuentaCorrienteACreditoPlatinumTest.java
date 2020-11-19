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
public class CuentaCorrienteACreditoPlatinumTest {
    
    private CuentaCorrienteACreditoPlatinum instance;
    
    public CuentaCorrienteACreditoPlatinumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CuentaCorrienteACreditoPlatinum("David", 500.00);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoPlatinum
     */
    @Test
    public void testAbona() {
        double abono = 200.0;
        instance.abona(abono);
        assertEquals(300.00, instance.getSaldo(), 0.01);
        
    }

    /**
     * Test of ingresa method, of class CuentaCorrienteACreditoPlatinum
     */
    @Test
    public void testIngresa() {
        double ingreso = 9000.0;
        instance.ingresa(ingreso);
        assertEquals(9500.00, instance.getSaldo(), 0.01);
        
    }
    
}
