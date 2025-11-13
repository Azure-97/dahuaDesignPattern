package code.chapter23.command2;

/**
 * @Description: 抽象命令类
 */
abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }
    //执行命令
    public abstract void excuteCommand();
}