package lt.Karolis.dalyba;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IntDividerTest {

    @Test
    public void testDivision() throws ArgumentIsZeroException {
        //duomenys
        String firstNumber = "8";
        String secondNumber = "2";

        int expectedResult = 4;
        int actualResult;

        //veiksmas
        String[] numbers = {firstNumber, secondNumber};
        actualResult = IntDivider.divide(numbers);

        //sulyginam gautus rezultatus
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivision02() {

        String expected = "Karolis";
        String actual;

        actual = "Mano vardas yra Karolis";

        String resultInfo = String.format(
                "Expected: %s: Actual: %s",
                expected,
                actual
        );
        Assert.assertTrue(resultInfo, actual.contains(expected));
        //equals lygina ar x==x
        //contais tikrina ar x yra sakinyje
    }
}