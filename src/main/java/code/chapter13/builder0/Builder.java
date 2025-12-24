package code.chapter13.builder0;

//抽象的建造者类
abstract class Builder {
    public abstract void buildPartA();      //建造部件A

    public abstract void buildPartB();      //建造部件B

    public abstract Product getResult();    //得到产品
}

