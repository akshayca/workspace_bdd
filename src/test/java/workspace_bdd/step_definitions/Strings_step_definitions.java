package workspace_bdd.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import workspace_bdd.code.strings.LongestSubstring;
import workspace_bdd.code.strings.custom_exceptions.EmptyStringException;

import static org.junit.Assert.*;

public class Strings_step_definitions {

    private LongestSubstring longestSubstring;
    private int result;

    @Given("I have longest substring length calculator")
        public void i_have_longest_substring_length_calculator() {
            
            //Arrange
            this.longestSubstring = new LongestSubstring();
    }

    @When("I use the string {string} to calculate")
        public void i_use_the_string_to_calculate(String string) throws EmptyStringException {
            
            //Act
            result = longestSubstring.lengthOfLongestSubstring(string);
    }

    @Then("The result should be {string}")
        public void the_result_should_be(String string) {
        
             // Assert
            assertEquals(string, String.valueOf(result));
    }
}
