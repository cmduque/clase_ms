package org.classes.ms;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FunctionServiceTest {

   //FunctionService calc;

    @BeforeClass
    public static void superInit(){
        System.out.println("Soy el superinicializador");
    }

    @Before
    public void init(){
        //calc = new FunctionService();
        System.out.println("Inicializando");
    }

    @Test
    public void testSum(){
        FunctionService calc = new FunctionService();
        Assert.assertEquals(10.0, calc.sum(4,6),0.001);
    }

    @Test
    public void testPow(){
        FunctionService calc = new FunctionService();

        Assert.assertEquals(243.0, calc.pow(3,5),.001);
    }

    @After
    public void close(){
        System.out.println("He terminado un test");
    }

    @AfterClass
    public static void superClose(){
        System.out.println("Fin");
    }
}
