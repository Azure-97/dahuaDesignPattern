package code.chapter16.state0;

public class Test {
	
	public static void main(String[] args){

		System.out.println("**********************************************");		
		System.out.println("《大话设计模式》代码样例 状态模式-基本代码");
		System.out.println();		

        Context c = new Context(new ConcreteStateA());
        
        c.request();
        c.request();
        c.request();
        c.request();

		System.out.println();
		System.out.println("**********************************************");

	}


}






