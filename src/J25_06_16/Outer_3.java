package J25_06_16;

class Outer_extra {
    static class StaticInner{
        void hello(){
            System.out.println("Hi~");
        }
    }
}

public class Outer_3{
    public static void main(String[] args){
        Outer_extra.StaticInner inner = new Outer_extra.StaticInner();
        inner.hello();
    }
}