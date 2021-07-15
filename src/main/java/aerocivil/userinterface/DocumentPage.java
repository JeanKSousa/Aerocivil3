package aerocivil.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.At;
import org.openqa.selenium.By;

@At("https://www.grupobancolombia.com/wps/wcm/connect/f7a3486a-41af-46b9-8157-2fde21fa4d0a/poli%CC%81ticas-tratamiento-y-proteccio%CC%81n-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf?MOD=AJPERES&CVID=l33Qn2Y")
public class DocumentPage extends PageObject {
    public static final Target NAME_DOCUMENT = Target.the("Name of the document")
            .located(By.id("sidenavToggle"));
    public static final Target IFRAME = Target.the("Search iframe")
            .located(By.id("sidenavToggle"));
}
