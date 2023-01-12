package lt.Karolis.dalyba;

public class IntDivider {

    public static int divide(String[] skaiciai) throws ArgumentIsZeroException {
        int firstNumber = Integer.parseInt(skaiciai[0]);
        int secondNumber = Integer.parseInt(skaiciai[1]);

        if (firstNumber == 0 && secondNumber == 0) {
            throw new ArgumentIsZeroException("pirmas skaicius", "antras skaicius");
        } else if (firstNumber == 0) {
            throw new ArgumentIsZeroException("pirmas skaicius");
        } else if (secondNumber == 0) {
            throw new ArgumentIsZeroException("antras skaicius");
        }

        return firstNumber / secondNumber;
    }
}
