package code.chapter28.visitor3;

//人类抽象类
abstract class Person {
    //接受
    public abstract void accept(Action visitor);
}