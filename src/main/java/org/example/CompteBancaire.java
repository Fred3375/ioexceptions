package org.example;

public class CompteBancaire {

    // --------- MEMBRES DE BASE -------------
    private int soldeCompte; // Solde en CENTIMES d'euro

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public CompteBancaire() {
        // constructeur par défaut => non utilisé
        System.out.println("Passage dans le constructeur à 0 paramètre");
    }

    public CompteBancaire(int soldeInitial) {
        // if (soldeInitial < 500000) {
        this.soldeCompte = soldeInitial;
    }

    // --------- FIN DES MEMBRES DE BASE -------------

    // --------- METHODES METIERS --------------------

    /**
     * Parameter : int montantDemande
     * @return Boolean : retrait OK ou pas
     */
    public boolean retrait(int montantDemande) throws ExceptionSolde {
        if (montantDemande > soldeCompte) {
            // Solution 1 : un message
            // System.out.println("Solde insuffisant");

            // Solution 2 : lancer une exception
//            ExceptionSolde e = new ExceptionSolde("Solde insuffisant");
//            throw e;

            // Solution 2 raccourcie & anonyme
            throw new ExceptionSolde("Solde insuffisant");
        }
        else {
            soldeCompte -= montantDemande; // soldeCompte = soldeCompte - montant;
            return true;
        }
    }

}
