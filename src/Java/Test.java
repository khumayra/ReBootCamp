package Java;
class A{
    public void MethodA(){
        System.out.println("method A");
    }
}
class B extends A{
    public void MethodB(){
        System.out.println("method B");
    }
}

public class Test extends B{
    public void MethodC(){
        System.out.println("method C");
    }

    public static void main(String[] args){
        A obj = new Test();
        obj.MethodA();
    }
}

