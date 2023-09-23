import org.example.QuadraticEquation;
import org.testng.Assert;
import org.testng.annotations.Test;



public class QuadraticEquationTest {

    @Test
    public void equationHasTwoRootsTest() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2,3,-5);
        double[] roots = quadraticEquation.solution();
        Assert.assertTrue(roots.length == 2 && roots[0] == 1.0 && roots[1] == -2.5);
    }

    @Test
    public void equationHasOneRootTest() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(3, -18, 27);
        double[] roots = quadraticEquation.solution();
        Assert.assertTrue(roots.length == 1 && roots[0] == 3.0);
    }

    @Test
    public void equationHasNoRootsTest() {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,1,1);
        double[] roots = quadraticEquation.solution();
        Assert.assertTrue(roots == null);
    }

    @Test
    public void equationDoesNotExistTest() throws Exception {
        Assert.assertThrows(IllegalArgumentException.class, () ->
                new QuadraticEquation(0,3,5));
    }

}
