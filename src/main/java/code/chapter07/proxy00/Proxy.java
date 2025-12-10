package code.chapter07.proxy00;

//Proxy类
class Proxy implements ISubject{

	private RealSubject rs;

	public Proxy(){
		this.rs = new RealSubject();
	}				
	
	public void request(){		
		this.rs.request();
	}
}
