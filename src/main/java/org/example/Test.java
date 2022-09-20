package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws EmployeException {
        Entreprise e1 = new Entreprise("IBM");
        e1.ajouter(new Employe("Dupond", 15000));
        e1.ajouter(new Employe("Poiret", 16000));
        e1.ajouter(new Employe("Burot", 15700));
        e1.ajouter(new Employe("Pernaut", 14300));
        System.out.println(e1);

        // Remplit une liste avec les employés
        List<Employe> l = new ArrayList<>();
        for (Employe e : e1) {
            l.add(e);
        }

        Map<Double, String> employe = l.stream().filter(Employe::getSalaire > 15000).collect(Collectors.toMap(Employe::getSalaire, Employe::getNom));
        System.out.println(employe);
    }
}
