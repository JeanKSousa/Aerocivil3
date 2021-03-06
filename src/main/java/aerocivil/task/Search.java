package aerocivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static aerocivil.userinterface.TreatmentPolicies.*;

public class Search implements Task {

    public static Search document() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NOSOTROS),
                Click.on(SERVICIOS),
                Click.on(PROVIDER),
                Scroll.to(DOWNLOAD_DOCUMENT).andAlignToBottom(),
                Click.on(DOWNLOAD_DOCUMENT)
        );
        //actor.attemptsTo(Changing.theWindow(NUMBER_WINDOW));
    }
}

