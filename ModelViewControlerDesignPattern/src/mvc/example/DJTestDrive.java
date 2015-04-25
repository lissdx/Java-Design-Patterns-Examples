package mvc.example;

import mvc.impl.BeatController;
import mvc.impl.BeatModel;
import mvc.iterfaces.BeatModelInterface;
import mvc.iterfaces.ControllerInterface;
  
public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
