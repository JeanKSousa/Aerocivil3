package aerocivil.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class SwitchTo {
    public SwitchTo(){
    }

    public static Iframe iframe(Target target){
        return Tasks.instrumented(Iframe.class,target);
    }
    public static IframeDefault iframeDefault(){
        return Tasks.instrumented(IframeDefault.class);
    }


}
class Iframe implements Interaction{

    public Iframe(Target target) {
        this.target = target;
    }
    private Target target;

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(target.resolveFor(actor));
    }
}

class IframeDefault implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent();
    }
}


