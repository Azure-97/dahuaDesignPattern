package code.chapter27.interpreter0;

//终结符表达式
class TerminalExpression extends AbstractExpression {
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}