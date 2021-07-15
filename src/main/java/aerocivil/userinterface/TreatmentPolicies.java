package aerocivil.userinterface;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TreatmentPolicies {
    public static final Target NOSOTROS = Target.the("Enter to Acerca de nosotros")
            .located(By.id("header-nosotros"));
    public static final Target SERVICIOS = Target.the("Enter to services of Bancolombia")
            .located(By.id("serv"));
    public static final Target PROVIDER = Target.the("Enter to Proveedores")
            .located(By.xpath("//a[contains(text(), 'Proveedores')]"));
    public static final Target DOWNLOAD_DOCUMENT = Target.the("Document")
            .located(By.xpath("//div[@id='wizard2']//div//div[3]//div//div[1]//div//p[2]//a"));
    public static final Integer NUMBER_WINDOW = Serenity.getWebdriverManager().getActiveWebdriverCount();

}
