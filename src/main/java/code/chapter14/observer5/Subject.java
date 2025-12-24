package code.chapter14.observer5;

import java.util.Observable;

//Subject
class Subject extends Observable {
    protected String name;
    private String action;

    public Subject(String name) {
        this.name = name;
    }

    //得到状态
    public String getAction() {
        return this.action;
    }

    //设置状态（就是设置具体通知的话）
    public void setAction(String value) {
        this.action = value;
        setChanged();
        notifyObservers();
    }
}