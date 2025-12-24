package code.chapter14.observer3;

//看股票同事类
class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    public void update() {
        System.out.println(super.sub.name + "：" + super.sub.getAction() + "！" + super.name + "，请关闭股票行情，赶紧工作。");
    }
}
