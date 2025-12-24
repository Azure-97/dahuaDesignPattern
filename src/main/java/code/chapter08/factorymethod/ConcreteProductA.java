package code.chapter08.factorymethod;

//ConcreteProductA类
class ConcreteProductA extends Product {
    public void make() {
        System.out.println("产品A制造");
    }
}