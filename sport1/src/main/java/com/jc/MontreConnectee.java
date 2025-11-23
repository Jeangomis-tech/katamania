package com.jc;


import java.util.List;

public class MontreConnectee {

        /**
         * Calcule la distance totale et la moyenne des sessions
         * @param sessions Liste des sessions enregistrées
         * @return Objet Statistiques contenant le total et la moyenne
         */
        public static Statistiques calculerStatistiques(List<Session> sessions) {
            // TODO: Implémenter cette méthode
            // 1. Calculer la distance totale en parcourant toutes les sessions
            double totalDistance = 0.0;
            for(Session session : sessions) {
                totalDistance += session.getDistance();
            }
            // 2. Calculer la moyenne (total / nombre de sessions)
            double average = 0.0;
            for(Session session : sessions) {
                average += session.getDistance()/sessions.size();

            }
            // 3. Retourner un objet Statistiques avec ces valeurs

            return new Statistiques(totalDistance, average); // À remplacer
        }
}
// ========== SOLUTION (à regarder après avoir essayé) ==========
/*
public static Statistiques calculerStatistiques (List<Session> sessions) {
    double total = 0.0 ;

    // Parcourir toutes les sessions et additionner les distances
    for (Session session : sessions) {
        total += session.getDistance();
    }

    // Calculer la moyenne
    double moyenne = total / sessions.size();

    // Retourner les statistiques
    return new Statistiques(total, moyenne);
}

// OU avec Stream (Java 8+)
public static Statistiques calculerStatistiques (List<Session> sessions) {
    double total = sessions.stream()
                           .mapToDouble(Session::getDistance)
                           .sum();

    double moyenne = total / sessions.size();

    return new Statistiques(total, moyenne);
}
*/