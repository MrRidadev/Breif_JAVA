import java.util.Scanner;

public class Calculatrice {
    double a,  b;
    static void Addition(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre valeur A:");
        double a = sc.nextDouble();

        System.out.print("Entre valeur B:");
        double b = sc.nextDouble();




        System.out.println("la some de A et B :"+(a+b));
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
    }
    public static void main(String[] args){

        Menu();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre choix:");
        int choix = scanner.nextInt();
        switch (choix){
            case 1 :
                Addition();
                break;

        }
        scanner.close();
    }
}
