package code.chapter28.visitor0;

class ConcreteElementB extends Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operationB() {
    }
}