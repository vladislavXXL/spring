package coach;

/**
 * Class CoachCricket.
 * @author v.ivanov
 * @version 1
 * @since 26.09.2018
 */
public class CoachCricket implements Coach {

    /** Field fortuneService.*/
    private FortuneService fortuneService;

    /** Constructor.*/
    public CoachCricket() {
        System.out.println("CoachCricket: inside no-arg constructor");
    }

    /**
     * Setter fortuneService.
     * @param fortuneService fortuneService
     */
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CoachCricket: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    /**
     * Method to print task from coach.
     * @return result
     */
    @Override
    public String getCoachTask() {
        return "Practice fast bowling for 15 minutes.";
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
