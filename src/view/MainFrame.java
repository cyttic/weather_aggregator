package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private menu main_menu;
    private InfoPanel info_panel;
    private VisualizationPanel visual_panel;
    private PreferencesPanel preferences_panel;
    private ResultsPanel results_panel;

    public MainFrame(String str){
        super(str);
        main_menu = new menu();
        setJMenuBar(main_menu);

        visual_panel = new VisualizationPanel();
        add(visual_panel);

        preferences_panel = new PreferencesPanel();
        add(preferences_panel);

        results_panel = new ResultsPanel();
        add(results_panel);

        info_panel = new InfoPanel();
        add(info_panel);

        setLayout(new GridLayout(2,2));
        add(info_panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
