import java.util.Scanner;

public class Calculatrice {

    static double saisie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une valeur : ");
        return sc.nextDouble();
    }

    static void Addition(double a, double b) {
        System.out.println("La somme de " + a + " et " + b + " est : " + (a + b));
    }

    static void Soustraction(double a, double b) {
        System.out.println("La différence entre " + a + " et " + b + " est : " + (a - b));
    }

    static void Multiplication(double a, double b) {
        System.out.println("Le produit de " + a + " et " + b + " est : " + (a * b));
    }

    static void Division(double a, double b) {
        System.out.println("Le résultat de la division de " + a + " par " + b + " est : " + (a / b));
    }

    static double Puissance(double a, double b) {
        double result = Math.pow(a, b);
        System.out.println(a + " élevé à la puissance " + b + " est : " + result);
        return result;
    }

    static double RacineCarree(double a) {
        double result = Math.sqrt(a);
        System.out.println("La racine carrée de " + a + " est : " + result);
        return result;
    }

    static double Factorielle(double a) {
        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("La factorielle de " + a + " est : " + factorial);
        return factorial;
    }

    static void Menu() {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║            CALCULATRICE           ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║ 1. Addition         [+]           ║");
        System.out.println("║ 2. Soustraction     [-]           ║");
        System.out.println("║ 3. Multiplication   [×]           ║");
        System.out.println("║ 4. Division         [÷]           ║");
        System.out.println("║ 5. Puissance        [^]           ║");
        System.out.println("║ 6. Racine carrée    [√]           ║");
        System.out.println("║ 7. Factorielle      [!]           ║");
        System.out.println("║ 8. Quitter                        ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.print("Entrez votre choix : ");
    }

    public static void main(String[] args) {
        double x, y;
        int choix;
        do {
            Menu();
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    x = saisie();
                    y = saisie();
                    Addition(x, y);
                    break;
                case 2:
                    x = saisie();
                    y = saisie();
                    Soustraction(x, y);
                    break;
                case 3:
                    x = saisie();
                    y = saisie();
                    Multiplication(x, y);
                    break;
                case 4:
                    x = saisie();
                    y = saisie();
                    while (y == 0) {
                        System.out.println("La division par zéro n'est pas possible. Veuillez entrer une valeur différente de zéro");
                        y = saisie();
                    }
                    Division(x, y);
                    break;
                case 5:
                    x = saisie();
                    y = saisie();
                    Puissance(x, y);
                    break;
                case 6:
                    x = saisie();
                    RacineCarree(x);
                    break;
                case 7:
                    x = saisie();
                    Factorielle(x);
                    break;
                case 8:
                    System.out.println("Au revoir et à bientôt !");
                    break;
                default:
                    System.out.println("Choix invalide ! Veuillez réessayer.");
            }
        } while (choix != 8);
    }
}
