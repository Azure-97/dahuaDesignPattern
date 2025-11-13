package code.chapter18.memento2;

/**
 * @Description: 角色状态管理者
 */
class RoleStateCaretaker{

    private RoleStateMemento memento;
    public RoleStateMemento getRoleStateMemento(){
        return this.memento;
    }
    public void setRoleStateMemento(RoleStateMemento value){
        this.memento = value;
    }
}
