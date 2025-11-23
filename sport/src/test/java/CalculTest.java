import com.jc.Calcul;
import com.jc.Parcour;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculTest {
    @Test
    public void testCalcul(){
        List<Parcour> parcours = Arrays.asList(
                        new Parcour(7.5, "une"),
                        new Parcour(2.0, "deux"),
                        new Parcour(10.3, "trois"),
                        new Parcour(4.5, "quatre"),
                        new Parcour(9.00, "cinq")
                );
        double total = Calcul.calculate(parcours);

        assertEquals(33.3, total, 0.001);
    }
    @Test
    public void average(){
        List<Parcour> parcours = Arrays.asList(
                new Parcour(7.5, "une"),
                new Parcour(2.0, "deux"),
                new Parcour(10.3, "trois"),
                new Parcour(4.5, "quatre"),
                new Parcour(9.00, "cinq")
        );
        double average = Calcul.calculateAverage(parcours);

        assertEquals(6.66, average, 0.001);
    }
}
