package code.chapter19.component2;

class Leaf extends Component{
    public Leaf(String name){
        super(name);
    }

    public void add(Component component){
        System.out.println("Cannot add to a leaf.");
    }

    public void remove(Component component){
        System.out.println("Cannot remove from a leaf.");
    }

    public void display(int depth){
        //叶节点的具体显示方法，此处是显示其名称和级别
        for(var i=0;i<depth;i++)
            System.out.print("-");
        System.out.println(name);
    }
}