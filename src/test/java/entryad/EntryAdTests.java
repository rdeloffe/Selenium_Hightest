package entryad;

import base.BaseTests;
import org.testng.annotations.Test;

public class EntryAdTests extends BaseTests {
    @Test
    public void testCloseModal(){
        var entryadPage = homePage.clickEntryAd();

        entryadPage.modal_clickClose();
    }
}
