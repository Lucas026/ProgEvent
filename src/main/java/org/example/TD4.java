package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

public class TD4 {
    public static void main(String[] args) throws EmployeException {
        Entreprise e1 = new Entreprise("IBM");
        e1.ajouter(new Employe("Dupond", 5000));
        e1.ajouter(new Employe("Poiret", 6000));
        e1.ajouter(new Employe("Burot", 5700));
        e1.ajouter(new Employe("Pernaut", 4300));
        System.out.println(e1);

        // Remplit une liste avec les employés
        List<Employe> l = new ArrayList<>();
        for (Employe e : e1) {
            l.add(e);
        }
        // Tri par salaires croissants
        /*
        CompareSalaire comparateur = new CompareSalaire();
        Collections.sort(l, comparateur);
        System.out.println("Employés de " + e1.getNom()
                + " par ordre croissant des salaires");
        for (Employe employe : l) {
            System.out.println(employe.getNom() + " gagne "
                    + employe.getSalaire());
        }
        */

        Map<Double, String> employe = l.stream().collect(Collectors.toMap(Employe::getSalaire, Employe::getNom));
        System.out.println(employe);
    }
}
