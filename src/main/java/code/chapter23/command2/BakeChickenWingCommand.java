package code.chapter23.command2;

/**
 * @Description: 烤鸡翅命令类
 */
class BakeChickenWingCommand extends Command{
    public BakeChickenWingCommand(Barbecuer receiver){
        super(receiver);
    }
    public void excuteCommand(){
        receiver.bakeChickenWing();
    }
}