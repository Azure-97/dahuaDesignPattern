package code.chapter23.command3;


/**
 * @Description: 烤羊肉命令类
 */
public class BakeMuttonCommand extends Command{
    public BakeMuttonCommand(Barbecuer receiver){
        super(receiver);
    }

    public void excuteCommand(){
        receiver.bakeMutton();
    }
}


