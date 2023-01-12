package lt.Karolis.dalyba;

public class MainDalyba {
    public static void main(String[] args) {

        String[] arr = InputManager.askForInput();
//        System.out.println(arr[0]+" " + arr[1]);
        try {
            System.out.println(IntDivider.divide(arr));
        } catch (ArgumentIsZeroException e) {
            System.out.println(e);
        }

    }
}
