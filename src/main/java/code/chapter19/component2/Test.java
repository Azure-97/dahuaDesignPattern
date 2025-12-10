package code.chapter19.component2;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args){

		System.out.println("**********************************************");		
		System.out.println("《大话设计模式》代码样例 组合模式-基本代码");
		System.out.println();		

        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));        
        root.add(comp);
        
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);

        Leaf leaf = new Leaf("Leaf C");
        root.add(leaf);

        Leaf leaf2 = new Leaf("Leaf D");
        root.add(leaf2);
        root.remove(leaf2);

        root.display(1);


		System.out.println();
		System.out.println("**********************************************");

	}
}





