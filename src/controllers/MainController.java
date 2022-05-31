package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainModel.BeosztasList.forEach(beosztas ->{
            this.mainFrame.beosztasModel.addElement(beosztas.name);            
        });
        this.setEvents();
    }


    private void setEvents() {
        this.mainFrame.beosztasCombo.addActionListener(e -> onActionbeosztasCombo());
    }
    private void onActionbeosztasCombo() {
        int index = this.mainFrame.beosztasCombo.getSelectedIndex();
        // System.out.println(index);
        int selectedGroupId = index + 1;
        this.mainModel.workerList.forEach(worker -> {
            
            if(selectedGroupId == worker.id) {
                System.out.println(worker.name);
                
            }
        });
    }   
}