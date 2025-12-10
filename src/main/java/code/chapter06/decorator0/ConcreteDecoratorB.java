package code.chapter06.decorator0;

//ConcreteDecoratorB类
class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();//首先运行了原有Component的Operation()
        this.AddedBehavior();//再执行本类独有功能
    }

    //本类独有方法，以区别于ConcreteDecoratorA类
    private void AddedBehavior() {
        System.out.println("具体装饰对象B的独有操作");
    }
}