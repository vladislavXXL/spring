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

    /** Field email.*/
    private String emailAddress;

    /** Field team.*/
    private String team;

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
     * Email address setter.
     * @param emailAddress email
     */
    public void setEmailAddress(String emailAddress) {
        System.out.println("CoachCricket: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    /**
     * Team setter.
     * @param team set team
     */
    public void setTeam(String team) {
        System.out.println("CoachCricket: inside setter method - setTeam");
        this.team = team;
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

    /**
     * Email address getter.
     * @return email
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Team getter.
     * @return team
     */
    public String getTeam() {
        return this.team;
    }
}
