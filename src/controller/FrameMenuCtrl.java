package controller;

import view.FrameMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMenuCtrl implements ActionListener {

    private FrameMenu frameMenu;

    public FrameMenuCtrl() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frameMenu.getOpcion1()) {
        	
        	new FrameAgregarAutoCtrl();
        	
        }else if (e.getSource() == frameMenu.getOpcion2()) {
        	
        	new FrameAgregarMantCtrl();
        }
    }

    public FrameMenu getFrameMenu() {
        return frameMenu;
    }

    public void setFrameMenu(FrameMenu frameMenu) {
        this.frameMenu = frameMenu;
    }
}
