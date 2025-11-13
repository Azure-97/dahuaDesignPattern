package code.chapter23.command2;

/**
 * @Description: 烤羊肉命令类
 */
class BakeMuttonCommand extends Command{
    public BakeMuttonCommand(Barbecuer receiver){
        super(receiver);
    }
    public void excuteCommand(){
        receiver.bakeMutton();
    }
}