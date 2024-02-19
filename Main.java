public class Main {
    public static int getValueAsNumber(String value) {
        if (value.equals("JACK") || value.equals("KING") || value.equals("QUEEN")) {
            return 10;
        } else if (value.equals("Ace")) {
            return 11;
        } else {
            return Integer.parseInt(value);
        }
    }

    public static void hitPlayer(PaquetCartes paquet) {
        Carte carte = paquet.getCarteAleatoire();
        int valeurCarte = getValueAsNumber(carte.getValeur());
        System.out.println("Le joueur a reçu la carte : " + carte.getValeur() + " de " + carte.getCouleur());
        System.out.println("Valeur totale des cartes du joueur : " + valeurCarte);
    }

    public static void hitCroupier(PaquetCartes paquet) {
        Carte carte = paquet.getCarteAleatoire();
        int valeurCarte = getValueAsNumber(carte.getValeur());
        System.out.println("Le croupier a reçu la carte : " + carte.getValeur() + " de " + carte.getCouleur());
        System.out.println("Valeur totale des cartes du croupier : " + valeurCarte);
    }

    public static void hitHiddenCard(PaquetCartes paquet) {
        Carte carte = paquet.getCarteAleatoire();
        System.out.println("Le croupier a reçu une carte cachée.");
    }
}



