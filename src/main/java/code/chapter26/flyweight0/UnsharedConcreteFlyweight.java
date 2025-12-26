package code.chapter26.flyweight0;

//不需要共享的Flyweight子类
class UnsharedConcreteFlyweight extends Flyweight {
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight:" + extrinsicstate);
    }
}