package code.chapter16.state4;


public class Test {
	/**
	 * @description: 参照state3自己实现
	 * @param:
	 * @return:
	 */
	public static void main(String[] args){

		System.out.println("**********************************************");		
		System.out.println("《大话设计模式》代码样例");
		System.out.println();		

        
        //紧急项目
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.writeProgram();
        emergencyProjects.setHour(13);
		emergencyProjects.writeProgram();

		System.out.println();
		System.out.println("**********************************************");

	}
}





