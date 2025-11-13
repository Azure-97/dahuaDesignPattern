package code.chapter19.component2;

import java.util.ArrayList;

class Composite extends Component{
    private ArrayList<Component> children = new ArrayList<Component>();//一个子对象集合用来存储其下属的枝节点和叶节点

    public Composite(String name){
        super(name);
    }

    public void add(Component component){
        children.add(component);
    }
    public void remove(Component component){
        children.remove(component);
    }
    public void display(int depth){
        //显示其枝节点名称
        for(var i=0;i<depth;i++)
            System.out.print("-");
        System.out.println(name);
        //对其下级进行遍历
        for(Component item : children){
            item.display(depth+2);
        }
    }
}