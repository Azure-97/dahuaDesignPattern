package code.chapter16.state3;

//睡眠状态
class SleepingState extends State {
    public void writeProgram(Work w) {
        System.out.println("当前时间："+ w.getHour() +"点 不行了，睡着了。");
    }
}


