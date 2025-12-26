package code.chapter28.visitor0;

class ConcreteElementA extends Element {
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {
    }
}