public class Main {
    public static void main(String[] args) {
        Dipendente employee1 = new Dipendente("ID123", 1000, Department.AMMINISTRAZIONE);
        Dipendente employee2 = new Dipendente("ID456", 1200, Department.PRODUZIONE);
        Dipendente employee3 = new Dipendente("ID789", 900, Department.VENDITE);

        Dipendente[] employers = {employee1, employee2, employee3};
        for (int i = 0; i < employers.length; i++) {
            System.out.println("freshman: " + employers[i].getFreshman());
        }
    }
}