

import controller.TemperatureController;
import model.TemperatureModel;
import views.TemperatureView;

/**
 * This is the Main class that represents the entry point to our program
 *
 * @author Danuts
 *
 */
public class Main {

    public static void main(String[] args) {
        // Instantiate the MVC elements
        TemperatureModel model = new TemperatureModel();
        TemperatureView view = new TemperatureView();
        TemperatureController controller = new TemperatureController(view,model);

        view.setVisible(true);
    }

}
