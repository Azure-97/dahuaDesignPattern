package code.chapter28.visitor3;

//状态抽象类
abstract class Action {
    //得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);

    //得到女人结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);
}