package J25_06_16;

class Outer_2{
    private class HiddenInner{
        void secret(){
            System.out.println("This is private!");
        }
    }
    public void reveal(){
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}
public class Hidden_Inner {
    public static void main(String[] args){
        Outer_2 callInner = new Outer_2();
        callInner.reveal();
//        Outer_2.HiddenInner.secret(); // error
    }
}
