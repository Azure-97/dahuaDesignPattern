package code.chapter16.state0;

//具体状态类B
class ConcreteStateB extends State
{
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}