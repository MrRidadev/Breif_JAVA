import java.util.Scanner;

public class Calculatrice {
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
    static void Multiplication (double a ,double b){
        System.out.println("la Multiplication de A et B :"+(a * b));
    }
    static void Division (double a,double b){
        System.out.println("la Division de A et B :"+(a / b));
    }
    static  double Puissance(double a, double b){
        System.out.println("la Puissance de A et B :"+Math.pow( a, b));
        return Math.pow( a, b);
    }
    static  double RacineCarree(double a){
        System.out.println("la Racine carrée de A et B :"+Math.sqrt( a));
        return Math.sqrt( a);
    }
    static double Factorielle(double a){

        long factorial = 1;

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("la Factorielle :"+factorial);
        return factorial;

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
 int choix;
do {
    Menu();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Entre choix:");
     choix = scanner.nextInt();
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
        case 3 :
            x=saisie();
            y=saisie();
            Multiplication(x,y);
            break;
        case 4 :
            x=saisie();
            y=saisie();
            Division(x,y);
            break;
        case 5 :
            x=saisie();
            y=saisie();
            Puissance(x,y);
            break;
        case 6 :
            x=saisie();
            RacineCarree(x);
            break;
        case 7 :
            x=saisie();
            Factorielle(x);
            break;
        case 8:
            System.out.println("au revoir !!");
            break;
        default:
            System.out.println("choix invaible !!");
    }
}while (choix !=8);


    }
}
