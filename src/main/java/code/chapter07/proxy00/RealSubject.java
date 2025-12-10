package code.chapter07.proxy00;

//RealSubject类
class RealSubject implements ISubject {
	
	public void request(){
		System.out.println("真实的请求。");
	}

}