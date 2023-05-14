package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class HomeService extends ActionManager {
    public static void verificaSliders() {

        click(HOME_SLIDERS);
    }

    public static void clickSliders() {
        for (int i = 0; i < 3; i++) {
            verificaSliders();
        }
    }

    public static void verificaArrivals() {
        WebActionManager.isVisible(RUBY);
        WebActionManager.isVisible(HTML);
        WebActionManager.isVisible(JAVA_SCRIPT);
    }
}
