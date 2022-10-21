package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        CompteBancaire monCompte = new CompteBancaire(500050); // SOLUTION 1 PREFEREE
        // monCompte.setSoldeCompte(500000); // solution 2 : par le setter
        // TODO monCompte.depot(500000); // Solution 3 sympa

        System.out.println("LOG : Solde initial " + monCompte.getSoldeCompte() / 100
                            + " euros et " + monCompte.getSoldeCompte() % 100 + " cents.");

        // 1er retrait de 300.50 € sur monCompte
        try {
            monCompte.retrait(300050);
        } catch (ExceptionSolde e) {
            throw new RuntimeException(e); // code généré par ALT Entree
        }

        System.out.println("LOG : Solde après premier retrait " + monCompte.getSoldeCompte() / 100
                + " euros et " + monCompte.getSoldeCompte() % 100 + " cents.");

        // 2e retrait de 3000.00 € sur monCompte
        /* Pöur mémoire le solde est 2000.00 */
        try {
            monCompte.retrait(300000);
        } catch (ExceptionSolde e) {
            System.out.println("Une erreur s'est produite : " + e.getMessage());

            /* Ferait remonter une (nouvelle) exception à l'appelant */
            // throw new RuntimeException("Incident");
        }

        System.out.println("LOG : Solde après deuxième retrait " + monCompte.getSoldeCompte() / 100
                + " euros et " + monCompte.getSoldeCompte() % 100 + " cents.");


    }

/*
    public void fonction1() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("toto.txt");
    }
    public void fonction2() {
        try {
            FileInputStream f = new FileInputStream("toto.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
*/
}

/*
declare type int [-32758..32767]
declare type CompteBancaire {.......}

int i;
int j;
CompteBancaire monComptePrincipal = new CompteBancaire;
CompteBancaire monCompteSecondaire = new CompteBancaire;
*/

