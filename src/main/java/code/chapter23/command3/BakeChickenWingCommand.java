package code.chapter23.command3;


/**
 * @Description: 烤鸡翅命令类
 */
public class BakeChickenWingCommand extends Command{
    public BakeChickenWingCommand(Barbecuer receiver){
        super(receiver);
    }

    public void excuteCommand(){
        receiver.bakeChickenWing();
    }
}


