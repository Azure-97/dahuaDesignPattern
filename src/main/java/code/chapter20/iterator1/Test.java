package code.chapter20.iterator1;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args){

		System.out.println("**********************************************");		
		System.out.println("《大话设计模式》代码样例");
		System.out.println();		

        ConcreteAggregate bus = new ConcreteAggregate();
        bus.add("大鸟");
        bus.add("小菜");
        bus.add("行李");
        bus.add("老外");
        bus.add("公交内部员工");
        bus.add("小偷");

        //正序迭代器
        System.out.println("**************************正序迭代器 start********************");
        Iterator conductor = new ConcreteIterator(bus);
        conductor.first();


        while (!conductor.isDone()) {
            System.out.println(conductor.currentItem() + "，请买车票!");
            conductor.next();
        }
        System.out.println("**************************end********************");

        System.out.println("**************************倒序迭代器 start********************");
        //倒序迭代器
        Iterator conductordesc = new ConcreteIteratorDesc(bus);

        conductordesc.first();
        while (!conductordesc.isDone()) {
            System.out.println(conductordesc.currentItem() + "，请买车票!");
            conductordesc.next();
        }

		System.out.println();
		System.out.println("**************************end********************");

	}
}









