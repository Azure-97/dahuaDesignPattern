package code.chapter28.visitor3;

//女人类
class Woman extends Person {
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}