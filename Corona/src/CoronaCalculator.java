import java.io.IOException;

public class CoronaCalculator {

    public static void main(String[] args){

        try {
            UI ui = new UI();
            CalculatorProperties properties = ui.getProperties();
            Calculator calculator = new Calculator(properties.getPopulation(), properties.getInitialAmountOfEffected(),properties.getDailySpreadRate(), properties.getExpectedPopulationCoverage(), properties.getDeathRate(), properties.getPercentageInNeedOfIVE(), properties.getPercentageInNeedOfMedicalCare(), properties.getMaxIVA(), properties.getDaysOfIllness());
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Calculator calulator = new Calculator(1500000, 1000, 25.0, 60.0, 0.5, 1.0, 10.0, 1000, 14);
    }
}

