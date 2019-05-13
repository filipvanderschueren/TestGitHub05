package be.ua.fti;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyMessage m = new MyMessage();
        m.setMessage( "a hello message from the class" );

        System.out.println("new message : "+ m.getMessage());

        Value v = new Value(22);
        System.out.println("Value added : " + v.getaValue());

    }
}
