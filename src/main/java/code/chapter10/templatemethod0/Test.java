package code.chapter10.templatemethod0;

public class Test {

    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("《大话设计模式》代码样例 模板方法模式-基本代码");
        System.out.println();

        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();
        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();


        System.out.println();
        System.out.println("**********************************************");

    }
}

