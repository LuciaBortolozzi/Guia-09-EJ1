package defaultPackage;

import controller.FrameMenuCtrl;
import view.FrameMenu;

public class main {

	public static void main(String[] args) {
		FrameMenuCtrl FMCtrl = new FrameMenuCtrl();
		FrameMenu FMenu = new FrameMenu(FMCtrl);
	}

}
