package code.chapter16.state4;

/**
 * @description:
 * @author: Azure
 * @date: 2025/11/11 周二 12:00
 * @Version 1.0
 **/
public class StateA extends State{
    @Override
    public void writeProgram(Work w) {
        if (w.getHour() < 12){
            System.out.println("精神百倍");
        }else {
            w.current = new StateB();
            w.writeProgram();
        }
    }
}
