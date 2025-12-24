package code.chapter14.observer4;

import java.util.Observable;
import java.util.Observer;

//看股票同事类
class StockObserver implements Observer {

    protected String name;

    public StockObserver(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) { //两个参数是原生接口要求的参数

        Boss b = (Boss) o; //需要拆箱将Observable对象转成Boss

        System.out.println(b.name + "：" + b.getAction() + "！" + this.name + "，请关闭股票行情，赶紧工作。");
    }
}
