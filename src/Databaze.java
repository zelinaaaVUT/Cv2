public class Databaze {
    private String Name;
    private int Rok_Narozeni;
    private double Vyse_Uvazku;
    public static double max = 1;

    public Databaze(String name, int rok_narozeni){
        this.Name = name;
        this.Rok_Narozeni = rok_narozeni;
    }

    public String getName() {
        return Name;
    }

    public int getRok_Narozeni() {
        return Rok_Narozeni;
    }

    public double getVyse_Uvazku() {
        return Vyse_Uvazku;
    }

    public static void SetMax(double max_input) {
        max = max_input;
    }

    public boolean ReturnTrueOrFalse(double New_Vyse_Uvazku){
        if (Vyse_Uvazku + New_Vyse_Uvazku > max) {
            return false;
        } else {
            Vyse_Uvazku += New_Vyse_Uvazku;
            return true;
        }
    }
}
