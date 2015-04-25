package mvc.example;

import mvc.impl.HeartController;
import mvc.impl.HeartModel;
import mvc.iterfaces.ControllerInterface;
  
public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
