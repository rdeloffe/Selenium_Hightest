package horizontalslider;

import base.BaseTests;
import org.testng.annotations.Test;

public class HonrizontalSliderTests extends BaseTests {

    @Test
    public void testHorizontalSlide(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSliderToValue(4);

        // Vérifier que la valeur affichée est bien 4
        assert horizontalSliderPage.getRangeValue().equals("4") : "Le slider n'a pas atteint 4";
    }
}
