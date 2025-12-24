package code.chapter14.observer4;

import java.util.Observable;
import java.util.Observer;

//看NBA同事类
class NBAObserver implements Observer {

    protected String name;

    public NBAObserver(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Boss b = (Boss) o;
        System.out.println(b.name + "：" + b.getAction() + "！" + this.name + "，请关闭NBA直播，赶紧工作。");
    }
}

