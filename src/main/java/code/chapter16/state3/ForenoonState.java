package code.chapter16.state3;

//上午工作状态
class ForenoonState extends State {
    public void writeProgram (Work w) {
        if (w.getHour() < 12)  {
            System.out.println("当前时间："+ w.getHour() +"点 上午工作，精神百倍");
        }
        else {
            w.setState(new NoonState());

            w.writeProgram();
        }
    }
}