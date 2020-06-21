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
        if (e.getSource() == frameMenu.getOption1()) {
            FrameAgregarAuto dialog = new FrameAgregarAuto(new FrameAgregarAutoCtrl());
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
    }
    }

    public FrameMenu getFrameMenu() {
        return frameMenu;
    }

    public void setFrameMenu(FrameMenu frameMenu) {
        this.frameMenu = frameMenu;
    }
}
