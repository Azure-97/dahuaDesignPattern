package code.chapter12.facade0;

public class Test {

    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("《大话设计模式》代码样例 外观模式-基本代码");
        System.out.println();

        Facade facade = new Facade();

        facade.methodA();
        facade.methodB();

        System.out.println();
        System.out.println("**********************************************");

    }
}




