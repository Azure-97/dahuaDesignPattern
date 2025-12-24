package code.chapter14.observer5;

import java.util.Observable;
import java.util.Observer;

//看股票同事类
class StockObserver implements Observer {
    protected String name;

    public StockObserver(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {

        Subject b = (Subject) o;

        System.out.println(b.name + "：" + b.getAction() + "！" + this.name + "，请关闭股票行情，赶紧工作。");
    }
}
