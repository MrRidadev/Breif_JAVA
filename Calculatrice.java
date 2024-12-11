import java.util.Scanner;

public class Calculatrice {
    double a,  b;
    static double saisie(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre valeur :");
        double a = sc.nextDouble();
        return a;
    }
    static void Addition(double a ,double b ){

        System.out.println("la some de A et B :"+(a+b));
    }
    static void Soustraction(double a ,double b){
        System.out.println("la Soustraction de A et B :"+(a-b));
    }
    static void Menu(){
        System.out.println("======== MENU ==========");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Puissance");
        System.out.println("6. Racine carrée");
        System.out.println("7. Factorielle");
        System.out.println("8. Quttter");
    }
    public static void main(String[] args){
double x,y;
        Menu();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre choix:");
        int choix = scanner.nextInt();
        switch (choix){
            case 1 :
                x=saisie();
                y=saisie();
                Addition(x,y);
                break;
            case 2 :
                x=saisie();
                y=saisie();
                Soustraction(x,y);
                break;

            case 8:
                System.out.println("au revoir !!");
                break;
            default:
                System.out.println("choix invaible !!");
        }
        scanner.close();
    }
}
