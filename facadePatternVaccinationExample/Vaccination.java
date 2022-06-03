package DailyAssignments.FacadePattern.FacadePattern;

import DailyAssignments.FacadePattern.FacadePattern.*;

public class Vaccination {
    CoviShield coviShield;
    Corbevax corbevax;
    Covaxin covaxin;

    public Vaccination() {
        coviShield = new CoviShield();
        corbevax = new Corbevax();
        covaxin = new Covaxin();
    }

    public void doingVaccinationWithCoviShield() {
        coviShield.vaccinatedWith();
    }

    public void doingVaccinationWithCorbevax() {
        corbevax.vaccinatedWith();
    }

    public void doingVaccinationWithCovaxin() {
        covaxin.vaccinatedWith();
    }
}
