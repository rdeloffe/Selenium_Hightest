package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClick(){
        var contextmenuPage = homePage.clickContextMenu();
        contextmenuPage.contextmenu_RightClick();
        assertEquals(contextmenuPage.contextmenu_getText(),"You selected a context menu","Bad text");
        contextmenuPage.contextmenu_clickAccept();
    }
}
