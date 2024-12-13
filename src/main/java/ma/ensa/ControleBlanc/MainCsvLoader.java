package ma.ensa.ControleBlanc;

import ma.ensa.ControleBlanc.controller.CsvLoader;

import ma.ensa.ControleBlanc.models.Membre;
import java.util.Set;

public class MainCsvLoader {
    public static void main(String[] args) {
        CsvLoader loader = new CsvLoader();
        Set<Membre> membres = loader.chargerListeMembre("src/main/resources/membres.csv");
        membres.forEach(System.out::println);
    }
}
