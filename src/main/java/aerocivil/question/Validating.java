package aerocivil.question;

import aerocivil.model.SearchData;
import aerocivil.userinterface.DocumentPage;
import aerocivil.userinterface.TreatmentPolicies;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static aerocivil.userinterface.TreatmentPolicies.*;

public class Validating implements Question<Boolean> {
    public Validating(List<SearchData> searchData) {
        this.searchData = searchData;
    }
    List<SearchData> searchData;
    public static Validating theDocument(List<SearchData> searchData) {
        return new Validating(searchData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameDocument = Text.of(DOWNLOAD_DOCUMENT).viewedBy(actor).asString();
        if (searchData.get(0).getTitle().equals(nameDocument)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
