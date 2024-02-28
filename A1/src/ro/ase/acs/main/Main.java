package ro.ase.acs.main;
import ro.ase.acs.classes.Pacient;
public class Main {
    public static void main(String[] args) {
        Pacient pacientFaraOptiuni = new Pacient("Ion Popescu");
        Pacient pacientCuOptiuni = new Pacient("Maria Ionescu", true, true, false, true);

        System.out.println(pacientFaraOptiuni);
        System.out.println(pacientCuOptiuni);
    }
}