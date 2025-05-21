package view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private menu main_menu;

    public MainFrame(String str){
        super(str);
        main_menu = new menu();
        setJMenuBar(main_menu);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
