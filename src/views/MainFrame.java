/*
* File: MainFrame.java
* Author: Juhász Roland
* Copyright: 2021, Juhász Roland
* Group: Szoft I N
* Date: 2021-05-31
* Github: https://github.com/Roleeygit/beosztas
* Licenc: GNU GPL
*/
package views;

import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> beosztasModel;
    public JComboBox<String> beosztasCombo;
    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.beosztasModel = new DefaultComboBoxModel<>();
        this.beosztasCombo = new JComboBox<>(this.beosztasModel);
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.add(this.beosztasCombo);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
        this.setTitle("Juhász Roland Szoft I N, 2022-05-31");
    }
}