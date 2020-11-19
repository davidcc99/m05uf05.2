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
public class CuentaCorrienteACreditoGoldTest {
    
    private CuentaCorrienteACreditoGold instance;
    
    public CuentaCorrienteACreditoGoldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CuentaCorrienteACreditoGold("David", 500.00);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoGold.
     */
    @Test
    public void testAbona() {
        double abono = 200.0;
        instance.abona(abono);
        assertEquals(300.00, instance.getSaldo(), 0.01);
        
    }

    /**
     * Test of ingresa method, of class CuentaCorrienteACreditoGold.
     */
    @Test
    public void testIngresa() {
        
        double ingreso = 5000.0;
        instance.ingresa(ingreso);
        assertEquals(5500.00, instance.getSaldo(), 0.01);
        
    }
    
}
