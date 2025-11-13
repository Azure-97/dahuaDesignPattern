package code.chapter20.iterator1;

//迭代器抽象类
abstract class Iterator{

    public abstract Object first();         //第一个
    public abstract Object next();          //下一个
    public abstract boolean isDone();       //是否到最后
    public abstract Object currentItem();   //当前对象

}
