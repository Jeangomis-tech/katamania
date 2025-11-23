import com.jc.CaclculeVente;
import com.jc.Produit;
import com.jc.Stock;
import com.jc.Vente;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculVenteTest {
    @Test
    public void calcularVente() {

        List<Vente> ventes = Arrays.asList(
                new Vente("1A", 15.0, LocalDateTime.of(2025, 11, 21, 0, 0)),
                new Vente("1B", 20.0, LocalDateTime.of(2025, 11, 20, 0, 0)),
                new Vente("1C", 14.0, LocalDateTime.of(2025, 11, 22, 0, 0)),
                new Vente("1D", 12.0, LocalDateTime.of(2025, 11, 22, 0, 0))
        );
        long totalVenteJour = CaclculeVente.venteDujour(ventes, LocalDateTime.of(2025, 11, 22, 0, 0));

        assertEquals(2, totalVenteJour);

    }
    @Test
    public void stockTest() {
        List<Produit> produits = Arrays.asList(
                new Produit("Mangue", 4),
                new Produit("orange", 2),
                new Produit("Goyave", 1),
                new Produit("Pomme", 3),
                new Produit("Poire", 5)
        );

        List<Produit> lowerStocks = Stock.surveillance(produits);
        assertEquals(2, lowerStocks.size());
    }
}
