package code.chapter26.flyweight0;

//需要共享的具体Flyweight子类
class ConcreteFlyweight extends Flyweight {
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight:" + extrinsicstate);
    }
}
