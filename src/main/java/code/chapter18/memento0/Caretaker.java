package code.chapter18.memento0;

/**
 * @Description: 管理者
 */
class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento value) {
        this.memento = value;
    }
}