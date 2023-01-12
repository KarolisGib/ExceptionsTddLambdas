package lt.Karolis.lamda;

public class MainLamda {
    public static void main(String[] args) {

        //traditional way
        MyErrorMessage errorMessage = new MyErrorMessage() {
            @Override
            public void show(String message, int number) {
                System.out.println(message + " | " + number);
            }
        };

        errorMessage.show("Sveiki biciuliai", 45);


        //with lamda

        MyErrorMessage errorMessageSecond =
                (message, number) -> {
                    //some code logic
                    System.out.println(message + " | " + number);
                };
        errorMessageSecond.show("Sveiki biciuliai", 45);


        Addable addable = (a, b) -> {return a + b;};
        System.out.println("Suma: " + addable.doMath(3, 2));

        addable = (a, b) -> {return a - b;};
        System.out.println("Skirtumas: " + addable.doMath(3, 2));

        addable = Integer::sum;
        System.out.println("Suma: " + addable.doMath(3, 2));
    }
}

