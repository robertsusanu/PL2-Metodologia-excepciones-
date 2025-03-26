package Ejercicio3;

public class MethodCallStack {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA(){
        System.out.println("Enter methodA()");
        try{
            methodB();
        } catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Exit methodA()");
        }
    }
    public static void methodB() throws Exception {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC() throws Exception {
        System.out.println("Enter methodC()");
        methodD();
        System.out.println("Exit methodC()");
    }
    public static void methodD() throws Exception {
        System.out.println("Enter methodD()");
        System.out.println(1 / 0);
        System.out.println("Exit methodD()");
    }
}
/* Al lanzar las excepciones a mitad del metodo, la otra mitad
   no se cumple y, por tanto, no pone en la salida que se sale
   del metodo. Los metodos van lanzando el problema mientras la
   clase Exception va recorriendo la pila de llamadas hacia atrás
   hasta que encuentra el manejador de excepciones, cuando lo
   encuentra maneja la excepcion y termina el metodo en el que
   se situa el manejador*/
