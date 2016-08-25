package es.unican.calculadora2016;


import junit.framework.TestCase;

/**
 * Created by alejandro on 22/08/16.
 */
public class CalculadoraTest extends TestCase {
    private Calculadora c;

    public CalculadoraTest(){
        c = new Calculadora();
    }// CalculadoraTest

    public void testSuma() throws Exception {
        //Test suma 2.0+1.0= 3.0
        c.setOperador1(2.0);
        c.setOperador2(1.0);
        assertEquals(3.0,c.suma());
    }// testSuma

    public void testResta() throws Exception {
        //Test resta 2.0-1.0= 2.0
        c.setOperador1(2.0);
        c.setOperador2(1.0);
        assertEquals(1.0,c.resta());
    } //testResta
}// CalculadoraTest