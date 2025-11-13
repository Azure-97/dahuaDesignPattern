package code.chapter17.adapter2;

//外籍中锋
class ForeignCenter {
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name = value;
    }

    public void 进攻(){
        System.out.println("外籍中锋 "+this.name+" 进攻");
    }    

    public void 防守(){
        System.out.println("外籍中锋 "+this.name+" 防守");
    }
}