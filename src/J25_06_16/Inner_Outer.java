package J25_06_16;


class Outer_1{
    String message = "From outer class";

    private class InnerClass{
        void displayMessage(){
            System.out.println("Inner says: " + message);
        }
    }
}
public class Inner_Outer {

//    public void callInner(){
//        InnerClass inner = new InnerClass();
//        inner.displayMessage();
//    }

    public static void main(String[] args){

        Outer_1 inner = new Outer_1();
//        Outer.InnerClass inner1 = new Outer.InnerClass(); // cannot call (Error)

//        outer.callInner();
    }
}
