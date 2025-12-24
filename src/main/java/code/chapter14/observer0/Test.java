package code.chapter14.observer0;

public class Test {

	public static void main(String[] args) {

		System.out.println("**********************************************");
		System.out.println("《大话设计模式》代码样例 观察者模式-基本代码");
		System.out.println();

		Subject subject = new ConcreteSubject();
		subject.attach(new ConcreteObserver("NameX", subject));
		subject.attach(new ConcreteObserver("NameY", subject));
		subject.attach(new ConcreteObserver("NameZ", subject));
		subject.setSubjectState("ABC");

		subject.notifyObserver();

		System.out.println();
		System.out.println("**********************************************");

	}
}




