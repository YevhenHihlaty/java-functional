package callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        helloRunnable ("John", null, () -> {
            System.out.println(" last name is not provided");
        });
    }
    static void hello (String firstName, String lastName, Consumer<String> callback){
        if (lastName == null) {
            callback.accept(firstName);
        } else {
            System.out.println(lastName);
        }
    }

    //same as js notation
    static void helloRunnable (String firstName, String lastName, Runnable callback){
        if (lastName == null) {
            callback.run();
        } else {
            System.out.println(lastName);
        }
    }

//
//    function hello(firstName, lastName, callback){
//        console.log(lastName? lastName: callback)
//    }
}


