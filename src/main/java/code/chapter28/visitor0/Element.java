package code.chapter28.visitor0;

abstract class Element {
    public abstract void accept(Visitor visitor);
}