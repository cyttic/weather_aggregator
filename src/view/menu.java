package view;

import controller.Utility;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JMenuBar implements ActionListener {
    JMenu m_1;
    JMenuItem exit_1;
    public menu() {
        m_1 = new JMenu("File");
        exit_1 = new JMenuItem("Exit");
        exit_1.addActionListener(this);

        m_1.add(exit_1);
        this.add(m_1);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(exit_1))
            Utility.onClose();
    }

}
