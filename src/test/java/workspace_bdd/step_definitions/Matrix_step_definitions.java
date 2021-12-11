package workspace_bdd.step_definitions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import workspace_bdd.code.Matrix.Toeplitz;

public class Matrix_step_definitions {
    
    private Toeplitz toeplitz;
    private boolean result;


    @Given("an m x n matrix")
    public void an_m_x_n_matrix() {
        this.toeplitz = new Toeplitz();        
    }
    @When("the matrix is Toeplitz")
    public void the_matrix_is_toeplitz() {

        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        result = toeplitz.isToeplitzMatrix(matrix);
        
    }
    @Then("return true if the matrix is Toeplitz Otherwise return false")
    public void return_true_if_the_matrix_is_toeplitz_otherwise_return_false() {
        assertTrue(result);
    }
        
}
