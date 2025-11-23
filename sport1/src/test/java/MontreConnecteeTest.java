import com.jc.MontreConnectee;
import com.jc.Session;
import com.jc.Statistiques;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MontreConnecteeTest {
    @Test
    public void testCalculerStatistiques() {
        List<Session> sessions = Arrays.asList(
                new Session(5.2, "Course matinale"),
                new Session(3.8, "Marche midi"),
                new Session(7.5, "Course soirée"),
                new Session(4.5, "Jogging")
        );

        Statistiques stats = MontreConnectee.calculerStatistiques(sessions);

        // Total attendu: 5.2 + 3.8 + 7.5 + 4.5 = 21.0
        assertEquals(21.0, stats.getDistanceTotale(), 0.01);

        // Moyenne attendue : 21.0 / 4 = 5.25
        assertEquals(5.25, stats.getDistanceMoyenne(), 0.01);
    }

    @Test
    public void testAvecUneSeuleSession() {
        List<Session> sessions = Arrays.asList(
                new Session(10.0, "Sortie unique")
        );

        Statistiques stats = MontreConnectee.calculerStatistiques(sessions);

        assertEquals(10.0, stats.getDistanceTotale(), 0.01);
        assertEquals(10.0, stats.getDistanceMoyenne(), 0.01);
    }

    @Test
    public void testAvecDistancesDecimales() {
        List<Session> sessions = Arrays.asList(
                new Session(2.75, "Session 1"),
                new Session(3.25, "Session 2"),
                new Session(4.50, "Session 3")
        );

        Statistiques stats = MontreConnectee.calculerStatistiques(sessions);

        assertEquals(10.5, stats.getDistanceTotale(), 0.01);
        assertEquals(3.5, stats.getDistanceMoyenne(), 0.01);
    }
}
