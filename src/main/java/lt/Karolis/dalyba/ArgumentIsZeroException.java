package lt.Karolis.dalyba;

public class ArgumentIsZeroException extends Throwable {

    String message;

    public ArgumentIsZeroException(String additional1) {
        message = "Negalima dalinti nes " + additional1 + " yra nulis";
    }

    ArgumentIsZeroException(String additional1, String additional2) {
        message =
                String.format(
                        "Negalime dalinti nes %s ir %s yra nulis",
                        additional1,
                        additional2
                );
    }


    @Override
    public String toString() {
        return message;
    }
}
