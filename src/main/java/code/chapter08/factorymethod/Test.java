package code.chapter08.factorymethod;

public class Test {

    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("《大话设计模式》代码样例 工厂方法-商场管理软件08简单工厂+策略模式+装饰模式+工厂方法");
        System.out.println();

        Creator[] creators = new Creator[2];
        creators[0] = new ConcreteCreatorA();
        creators[1] = new ConcreteCreatorB();

        for (Creator item : creators) {
            Product product = item.factoryMethod();
            product.make();
        }

        System.out.println();
        System.out.println("**********************************************");

    }
}










