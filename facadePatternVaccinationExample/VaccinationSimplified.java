package DailyAssignments.FacadePattern.FacadePattern;

public class VaccinationSimplified {
    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        vaccination.doingVaccinationWithCoviShield();
        vaccination.doingVaccinationWithCovaxin();
        vaccination.doingVaccinationWithCorbevax();
    }
}
/*
Vaccinated with CoviShield
Vaccinated with Covaxin
Vaccinated with Corbevax

Process finished with exit code 0
 */