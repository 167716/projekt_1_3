import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Reszta z dzielenia przez 10");
     System.out.println("Podaj liczbe: ");
    Scanner scan = new Scanner (System.in);              
    int a=scan.nextInt();
    double b=(a%10);
    System.out.println("Reszta z dzielenia to: "+b);
  }
}