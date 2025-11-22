import com.jc.Analyse;
import com.jc.Produit;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnalyseTest {
    @Test

    public void leProduitLePlusRentable(){

        List<Produit> produits = Arrays.asList(
                new Produit("Mangue", 2.5, 1.5),
                new Produit("Banane", 5.00, 2.00),
                new Produit("Poire", 2.5, 1.00),
                new Produit("Pomme", 2.5, 2.0)
        );
        Produit resultat = Analyse.produitLePlusRentable(produits);
        assertNotNull(resultat);
        assertEquals("Banane", resultat.getNom());
    }
    @Test
    public void leProduitLeMoinsRentable(){
        List<Produit> produits = Arrays.asList(
                new Produit("Carnet", 5.0, 2.0),  // marge 3
        new Produit("Stylo", 3.0, 1.0),    // marge 2
        new Produit("Sac", 20.0, 15.0),    // marge 5
        new Produit("Manteau", 200.0, 150.0),    // marge 5
        new Produit("Jean", 20.0, 19.5)
        );
        Produit resultat = Analyse.produitLeMoinsRentable(produits);
        assertNotNull(resultat);
        assertEquals("Jean", resultat.getNom());
    }
}
