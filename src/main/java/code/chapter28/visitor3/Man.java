package code.chapter28.visitor3;

//男人类
class Man extends Person {
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
