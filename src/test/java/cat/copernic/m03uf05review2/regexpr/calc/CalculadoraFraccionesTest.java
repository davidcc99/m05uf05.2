/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

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
public class CalculadoraFraccionesTest {
    
    private CalculadoraFracciones instance;
    
    public CalculadoraFraccionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fraccion f1 = new fraccion(2,3);
        fraccion f2 = new fraccion(2,3);
        instance = new CalculadoraFracciones(f1, f2);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of suma method, of class CalculadoraFracciones.
     */
    @Test
    public void testSuma() {
        assertEquals(new fraccion(12.0 , 9.0), instance.suma());
    }

    /**
     * Test of resta method, of class CalculadoraFracciones.
     */
    @Test
    public void testResta() {
        assertEquals(new fraccion(0.0 , 9.0), instance.resta());
    }

    /**
     * Test of division method, of class CalculadoraFracciones.
     */
    @Test
    public void testDivision() {
        assertEquals(new fraccion(6.0 , 6.0), instance.division());
    }

    /**
     * Test of multiplicacion method, of class CalculadoraFracciones.
     */
    @Test
    public void testMultiplicacion() {
        assertEquals(new fraccion(4.0 , 9.0), instance.multiplicacion());
    }
    
}
