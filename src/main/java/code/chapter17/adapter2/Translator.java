package code.chapter17.adapter2;

//翻译者类
class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name){
        super(name);
        foreignCenter.setName(name);
    }

    public void attack(){
        foreignCenter.进攻();
    }

    public void defense(){
        foreignCenter.防守();
    }
}