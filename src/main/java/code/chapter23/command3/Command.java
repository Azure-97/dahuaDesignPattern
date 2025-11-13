package code.chapter23.command3;

/**
 * @description: 抽象命令类
 **/
abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }
    //执行命令
    public abstract void excuteCommand();
}