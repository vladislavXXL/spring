package coach;

/**
 * Class CoachSwimming.
 * @author v.ivanov
 * @version 1
 * @since 25.09.2018
 */
public class CoachSwimming implements Coach {

    /** Field fortuneService.*/
    private FortuneService fortuneService;

    /**
     * Constructor
     * @param fortuneService
     */
    public CoachSwimming(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /**
     * Method to print task from coach.
     * @return result
     */
    @Override
    public String getCoachTask() {
        return "Swim 5 km in the sea.";
    }

    /**
     * Method to print daily fortune.
     * @return String result
     */
    @Override
    public String getDailyFortune() {
        return "Just do it: " + this.fortuneService.getFortune();
    }
}
