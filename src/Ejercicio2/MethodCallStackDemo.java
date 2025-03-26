package Ejercicio2;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC() {
        System.out.println("Enter methodC()");
        try{
            System.out.println(1 / 0);
        }catch(ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("Exit methodC()");
        }
         // divide-by-0 triggers an ArithmeticException
    }
}
