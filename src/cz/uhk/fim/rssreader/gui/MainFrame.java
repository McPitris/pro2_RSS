package cz.uhk.fim.rssreader.gui;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        init();
    }

    public void init() {
        setTitle("RSS reader");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
