package J25_06_16;

public class Inner_Outer2 {
    private String data = "Outer data";

    class Inner{
        void printData(){
            System.out.println(data);
        }
    }

    public Inner createInner(){
        return new Inner();
    }

    public static void main (String[] args){
        Inner_Outer2 outer = new Inner_Outer2();
        Inner_Outer2.Inner inner = outer.createInner();
        inner.printData();

        // Make outer & inner null; -> Garbage
        outer = null;
        inner.printData();

        inner = null;

        System.gc(); // Call Garbage collector
        System.out.println("Outer and Inner are no longer be used");
    }
}
