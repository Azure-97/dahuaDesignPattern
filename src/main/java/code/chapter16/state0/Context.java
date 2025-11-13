package code.chapter16.state0;

//上下文
class Context {
    private State state;
    public Context(State state)
    {
        this.state = state;
    }

    //可读写的状态属性，用于读取当前状态和设置新状态
    public State getState(){
        return this.state;
    }
    public void setState(State value){
        this.state = value;
        System.out.println("当前状态:" + this.state.getClass().getSimpleName());
    }
    
    public void request()
    {
        this.state.handle(this); 
    }
}
