package org.classes.ms;


import static org.mockito.Mockito.*;


import org.classes.ms.FunctionService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class FunctionServiceMockTest {

    @InjectMocks
    FunctionService calc = new FunctionService();

    //@Mock
    //FunctionServiceCloud funServCloud;

    @Before
    public void init(){

        //when(funServCloud.sum(5,5)).thenReturn(10.0);
        //when(funServCloud.sum(7,5)).thenReturn(12.0);
    }

    @Test
    public void sumMustReturn10WhenFirstNumberIs4AndSecondNumber6(){
        //calc = new FunctionService();
        Assert.assertEquals(10.0,calc.sum(4,6),0.001);

        //Arrange

        //Act


        //Assert



    }

    @Test
    public void testPow(){
        //calc = new FunctionService();

        Assert.assertEquals(9.0, calc.pow(3,2),0.001);
    }

    @Test
    public void testSubtraction(){
        Assert.assertEquals(20,calc.subtraction(35,15),0.001);
    }

    @Test
    public void testMultiplication(){
        Assert.assertEquals(45,calc.multiplication(9,5),0.005);
    }

    @Test
    public void testSumCloud(){

        //when(funServCloud.sum(5,5)).thenReturn(10.0);

        Assert.assertEquals(10.0, calc.sumEnOracleCloud(5,5),.001);

    }
}
