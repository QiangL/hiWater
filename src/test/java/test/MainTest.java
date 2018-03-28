package test;


public class MainTest{

    MainTest mainTest = new MainTest();
    static{
        System.out.println("static block");
    }
    public MainTest(){
        System.out.println("MainTest init");
    }
    private SubClass subClass = new SubClass();

    public static void main(String[] args) {
        System.out.println("main method");
    }
    class SubClass{
        SubClass(){
            System.out.println("SubClass init");
        }
    }
}

