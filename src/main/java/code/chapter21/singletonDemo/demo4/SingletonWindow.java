package code.chapter21.singletonDemo.demo4;

import javax.swing.*;

//窗体类
class SingletonWindow{
    public SingletonWindow(){
        JFrame frame = new JFrame("单例模式");
        frame.setSize(1024,768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();    
        // 添加面板
        frame.add(panel);
        
        panel.setLayout(null);

        JButton button = new JButton("打开工具箱");
        button.setBounds(10, 10, 120, 25);
        button.addActionListener(new ToolkitListener());
        panel.add(button);

        JButton button2 = new JButton("打开工具箱2");
        button2.setBounds(130, 10, 120, 25);
        button2.addActionListener(new ToolkitListener());
        panel.add(button2);

        frame.setVisible(true);
    }
}