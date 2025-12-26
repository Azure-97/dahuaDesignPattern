package code.chapter27.interpreter0;

//非终结符表达式
class NonterminalExpression extends AbstractExpression {
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}