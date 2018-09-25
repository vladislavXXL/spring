package coach;

/**
 * Football coach.
 * @author v.ivanov
 * @version 1
 * @since 24.09.2018
 */
public class CoachFootball implements Coach {

    /** Field fortuneService.*/
    private FortuneService fortuneService;

    /**
     * Constructor.
     * @param theFortuneService
     */
    public CoachFootball(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    /**
     * Method to print task from coach.
     * @return result
     */
    public String getCoachTask() {
        return "Run 5 km in the field.";
    }

    /**
     * Method to print daily fortune.
     * @return String result
     */
    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
