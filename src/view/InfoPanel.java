package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class InfoPanel extends JPanel {
    public InfoPanel(){
        super();
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBorder(BorderFactory.createTitledBorder("Info"));
    }
}
