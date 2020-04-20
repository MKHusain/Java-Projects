package Inheritance;

public class Iphone5 extends Iphone4 {

    @Override
    public void call() {
        System.out.println("Make a call");

    }

    @Override
    public void text() {
        System.out.println("Send a Text");

    }

    @Override
    public void videoCall() {
        System.out.println("Make a Video Call");

    }
}
