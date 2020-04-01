import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {

    private CalculatorProperties properties;

    public UI() throws IOException {
        properties = new CalculatorProperties();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input Population (default " + properties.getDefaultPopulation() + "): ");
        String name = reader.readLine();
        if (name.isEmpty()) {
            properties.setPopulation(properties.getDefaultPopulation());
        }else {
            properties.setPopulation(Integer.parseInt(name));
        }

        System.out.print("Input Initial Amount of Effected (default " + properties.getDefaultInitialAmountOfEffected() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setInitialAmountOfEffected(properties.getDefaultInitialAmountOfEffected());
        }else {
            properties.setInitialAmountOfEffected(Integer.parseInt(name));
        }

        System.out.print("Input Daily Spread Rate (default " + properties.getDefaultDailySpreadRate() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setDailySpreadRate(properties.getDefaultDailySpreadRate());
        }else {
            properties.setDailySpreadRate(Double.parseDouble(name));
        }

        System.out.print("Input Expected Population Coverage (default " + properties.getDefaultExpectedPopulationCoverage() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setExpectedPopulationCoverage(properties.getDefaultExpectedPopulationCoverage());
        }else {
            properties.setExpectedPopulationCoverage(Double.parseDouble(name));
        }

        System.out.print("Input Deathrate (default " + properties.getDefaultDeathRate() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setDeathRate(properties.getDefaultDeathRate());
        }else {
            properties.setDeathRate(Double.parseDouble(name));
        }

        System.out.print("Input Percentage In Need of IVE (default " + properties.getDefaultPercentageInNeedOfIVE() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setPercentageInNeedOfIVE(properties.getDefaultPercentageInNeedOfIVE());
        }else {
            properties.setPercentageInNeedOfIVE(Double.parseDouble(name));
        }

        System.out.print("Input Percentage In Need of Medical Care (default " + properties.getDefaultPercentageInNeedOfMedicalCare() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setPercentageInNeedOfMedicalCare(properties.getDefaultPercentageInNeedOfMedicalCare());
        }else {
            properties.setPercentageInNeedOfMedicalCare(Double.parseDouble(name));
        }

        System.out.print("Input Max IVA in use (default " + properties.getDefaultMaxIVA() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setMaxIVA(properties.getDefaultMaxIVA());
        }else {
            properties.setMaxIVA(Integer.parseInt(name));
        }

        System.out.print("Input Days of Illness (default " + properties.getDefaultDaysOfIllness() + "): ");
        name = reader.readLine();
        if (name.isEmpty()) {
            properties.setDaysOfIllness(properties.getDefaultDaysOfIllness());
        }else {
            properties.setDaysOfIllness(Integer.parseInt(name));
        }

    }

    public CalculatorProperties getProperties(){
        return properties;
    }

}
