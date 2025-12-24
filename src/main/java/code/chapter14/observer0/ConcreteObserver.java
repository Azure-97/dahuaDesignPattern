package code.chapter14.observer0;

//具体观察者类
class ConcreteObserver extends Observer {
    private String name;
    private Subject sub;

    public ConcreteObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update() {
        System.out.println("观察者" + this.name + "的新状态是" + this.sub.getSubjectState());
    }
}

 