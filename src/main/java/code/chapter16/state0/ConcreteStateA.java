package code.chapter16.state0;

//具体状态类A
class ConcreteStateA extends State 
{
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}