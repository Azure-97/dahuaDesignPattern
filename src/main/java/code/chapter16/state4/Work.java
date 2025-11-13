package code.chapter16.state4;

class Work {
    int hour;
    State current;


    public Work() {
        current = new StateA();
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void writeProgram() {
        current.writeProgram( this);
    }
}