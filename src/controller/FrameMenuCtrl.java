package controller;

import view.FrameAgregarAuto;
import view.FrameMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMenuCtrl implements ActionListener {

    private FrameMenu frameMenu;

    public FrameMenuCtrl() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameMenu.getOpcion1()) {
            FrameAgregarAuto FMauto = new FrameAgregarAuto(new FrameAgregarAutoCtrl());
            FMauto.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            FMauto.setVisible(true);
    }
    }

    public FrameMenu getFrameMenu() {
        return frameMenu;
    }

    public void setFrameMenu(FrameMenu frameMenu) {
        this.frameMenu = frameMenu;
    }
}
