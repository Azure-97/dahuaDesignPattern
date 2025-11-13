package code.chapter18.memento0;

/**
 * @Description: 备忘录类
 */
class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String value) {
        this.state = value;
    }
}