package cukes;

import java.util.ArrayList;
import java.util.List;
import cuke4duke.Table;
import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CukeSteps {

    private char theLetter;

    private List<Character> theLetters;

    @Given("^the letter '([A-Za-z])'$")
    public void gimmeALetter(final char theLetter) {
        this.theLetter = theLetter;
    }

    @Given("^the following letters:$")
    public void gimmeThemLetters(final Table letterTable) {

        final List<String> letters = letterTable.raw().get(0);
        theLetters = new ArrayList<Character>(letters.size());
        for (String letter : letters) {
            theLetters.add(letter.charAt(0));
        }

    }

    @When("^I check the letter(?:s)?$")
    public void checkThem() {
        // just a stub
    }

    @Then("^the letter should be '([A-Za-z])'$")
    public void checkTheLetter(final char aLetter) {
        assertThat(theLetter, is(aLetter));
    }

    @Then("^the letters should( | not )contain '([A-Za-z])'$")
    public void checkTheLetters(final String shouldNot, final char aLetter) {

        assertThat(theLetters.contains(aLetter), is(" ".equals(shouldNot)));

    }
}
