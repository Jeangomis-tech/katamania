import com.jc.Admision;
import com.jc.Etudiant;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AmissionTest {
    @Test

    public void AmissionTest(){

        List<Etudiant> etudiants = Arrays.asList(
                new Etudiant("Alice", new double[]{15.5, 12.0, 18.5, 14.0}),
                new Etudiant("Johane", new double[]{16.0, 12.5, 07.0, 11.0}),
                new Etudiant("Marie", new double[]{1.0, 13.5, 11.0, 0.0})
        );

        List<Etudiant> etudiantsAdmis = Admision.admision(etudiants);
        assertEquals("Alice", etudiantsAdmis.get(0).getNom());
        assertEquals("Johane", etudiantsAdmis.get(1).getNom());

    }
}
