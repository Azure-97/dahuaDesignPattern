package code.chapter16.state3;

//中午工作状态
class NoonState extends State {
    public void writeProgram (Work w) {
        if (w.getHour() < 13)  {
            System.out.println("当前时间："+ w.getHour() +"点 饿了，午饭；犯困，午休。");
        }
        else {
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
