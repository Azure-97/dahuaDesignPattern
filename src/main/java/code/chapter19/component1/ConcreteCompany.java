package code.chapter19.component1;

import java.util.ArrayList;

//具体分公司类，树枝节点
class ConcreteCompany extends Company {
    protected ArrayList<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    public void add(Company company) {
        children.add(company);
    }

    public void remove(Company company) {
        children.remove(company);
    }

    public void display(int depth) {
        for (var i = 0; i < depth; i++)
            System.out.print("-");
        System.out.println(name);
        for (Company item : children) {
            item.display(depth + 2);
        }
    }

    //履行职责
    public void lineOfDuty() {
        for (Company item : children) {
            item.lineOfDuty();
        }
    }
}