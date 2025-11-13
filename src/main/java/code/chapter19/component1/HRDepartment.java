package code.chapter19.component1;

//人力资源部，树叶节点
class HRDepartment extends Company{
    public HRDepartment(String name){
        super(name);
    }

    public void add(Company company){
    }
    public void remove(Company company){
    }
    public void display(int depth) { 
        for(var i=0;i<depth;i++)
            System.out.print("-");
        System.out.println(name);
    }            
    //履行职责
    public void lineOfDuty(){
        System.out.println(name+" 员工招聘培训管理");
    }
}