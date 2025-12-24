package code.chapter14.observer4;

import java.util.Observable;

//老板
class Boss extends Observable {
    protected String name;
    private String action;

    public Boss(String name) {
        this.name = name;
    }

    //得到状态
    public String getAction() {
        return this.action;
    }

    //设置状态（就是设置具体通知的话）
    public void setAction(String value) {
        this.action = value;

        super.setChanged();     //改变通知者的状态

        super.notifyObservers();//调用父类Observable方法，通知所有观察者
    }
}