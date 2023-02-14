import java.util.Scanner;
public class DatabaseOperation {
    public static void main(String[] args) {
        Databaze[] pole = new Databaze[3];

        for (int user = 0; user < 3; user++){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Zadej pro uzivatele s indexem %d\n", user);
            System.out.print("Jmeno:");
            String name = scanner.nextLine();
            System.out.println("Rok narozeni:");
            int year = scanner.nextInt();

            pole[user] = new Databaze(name, year);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadej maximalni povolenou vysi uvazku: ");
        Databaze.SetMax(scanner.nextDouble());

        while (true){
            System.out.println("Zadej index osoby: ");
            int index = scanner.nextInt();
            System.out.println("Zadej vysi noveho uvazku: ");
            double uvazek = scanner.nextDouble();

            if ((index >= 0) && (index < pole.length) && (pole[index].ReturnTrueOrFalse(uvazek))){
                System.out.printf("Jmeno: %s\n",pole[index].getName());
                System.out.printf("Rok narozeni: %d\n",pole[index].getRok_Narozeni());
                System.out.printf("Uvazek: %.2f\n",pole[index].getVyse_Uvazku());
            }
            else {
                System.out.println("Dosahl jsi maximalni vyse uvazku");
            }
        }
    }
}
