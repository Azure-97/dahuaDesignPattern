package code.chapter27.interpreter0;

//抽象表达式类
abstract class AbstractExpression {
    //解释操作
    public abstract void interpret(Context context);
}
