package org.classes.ms;

import org.junit.*;

import static org.junit.Assert.assertEquals;

//@SpringBootTest

public class FunctionServiceTest {

   FunctionService calc;

/*    @BeforeClass
    public static void superInit(){
        System.out.println("Soy el superinicializador");
    }*/

    @Before
    public void beforeMethed(){
        calc = new FunctionService();
    }

    @Test
    public void sumMustReturn10WhenFirstNumberIs4AndSecondNumberIs6(){
         //Arrange
        Integer firstNumber = 4;
        Integer secondNumber = 6;
        Integer expectedResult = 10;

        //Act
        Integer result = calc.sum(firstNumber, secondNumber);

        //Assert
        assertEquals(expectedResult, result);
   }

    @Test
    public void powMustReturn243WhenFirstNumberIs3AndSecondNumberIs5(){
        //FunctionService calc = new FunctionService();
        //Arrange
        Integer firstNumber = 3;
        Integer secondNumber  = 5;
        Integer expectedResult = 243;
        //Act
        Integer result = calc.pow(firstNumber,secondNumber);
        //Assert
        assertEquals(expectedResult,result);
    }

    @Test
    public void  subtractionMustReturn15WhenFirstNumberIs25AndSecondNumberIs10(){
        //Arrange
        Integer firstNumber = 25;
        Integer secondNumber = 10;
        Integer expectedResult = 15;
        //Act
        Integer result = calc.subtraction(firstNumber,secondNumber);
        //Assert
        assertEquals(expectedResult,result);
    }

    @Test
    public void multiplicationMustReturn25WhenFirstNumberIs5AndSecondNumberIs5(){
        //Arrange
        Integer firstNumber = 5;
        Integer secondNumber = 5;
        Integer expectedResult = 25;
        //Act
        Integer result = calc.multiplication(firstNumber,secondNumber);
        //assert
        assertEquals(expectedResult,result);
    }

    @Test
    public void divisionMustReturn5WhenFirstNumberIs20AndSecondNumberIs5(){
    //Arrange
        Integer firstNumber = 20;
        Integer secondNumber = 4;
        Integer expectedResult = 5;
        //Act
        Integer result = calc.division(firstNumber,secondNumber);
        //assert
        assertEquals(expectedResult,result);


    }




    /*@After
    public void close(){
        System.out.println("He terminado un test");
    }

    @AfterClass
    public static void superClose(){
        System.out.println("Fin");
    }*/
}
