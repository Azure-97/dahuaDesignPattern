package code.chapter16.state3;

//下班休息状态
class RestState extends State {
    public void writeProgram(Work w) {
        System.out.println("当前时间："+ w.getHour() +"点 下班回家了");
    }
}
