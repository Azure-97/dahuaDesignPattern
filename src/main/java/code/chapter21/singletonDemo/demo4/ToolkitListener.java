package code.chapter21.singletonDemo.demo4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//工具箱事件类
class ToolkitListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        //Toolkit toolkit = new Toolkit("工具箱");
        
        Toolkit.getInstance();

    }
}
