import lv.acodemy.classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator casio = new Calculator();
        @Test
        public void testSum() {

            Assert.assertEquals(casio.sum(10,50), 60);

        }
        @Test
        public void testDivide() {

            Assert.assertEquals(casio.divide(25,5), 5);
        }
        @Test

        public void testMultiply() {

            Assert.assertEquals(casio.multiply(5,5), 25);
        }
        @Test

        public void testSubtract() {

            Assert.assertEquals(casio.subtract(25,5), 20);
        }






}
