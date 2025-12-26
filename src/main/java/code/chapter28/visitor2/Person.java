package code.chapter28.visitor2;

//人抽象类
abstract class Person {
    protected String action;

    public String getAction() {
        return this.action;
    }

    public void setAction(String value) {
        this.action = value;
    }

    //得到结论或反应
    public abstract void getConclusion();
}