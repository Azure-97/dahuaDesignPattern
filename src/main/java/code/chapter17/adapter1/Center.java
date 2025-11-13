package code.chapter17.adapter1;

//中锋
class Center extends Player {
    public Center(String name){
        super(name);
    }

    public void attack(){
        System.out.println("中锋 "+this.name+" 进攻");
    }

    public void defense(){
        System.out.println("中锋 "+this.name+" 防守");
    }
}
