package code.chapter28.visitor3;

public class Test {

    public static void main(String[] args) {

        System.out.println("**********************************************");
        System.out.println("《大话设计模式》代码样例");
        System.out.println();

        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        //成功时的反应
        Success v1 = new Success();
        o.display(v1);


        //失败时的反应
        Failing v2 = new Failing();
        o.display(v2);

        //恋爱时的反应
        Amativeness v3 = new Amativeness();
        o.display(v3);

        //婚姻时的反应
        Marriage v4 = new Marriage();
        o.display(v4);


        System.out.println();
        System.out.println("**********************************************");
    }
}

















