package coach;

/**
 * Interface Coach.
 * @author v.ivanov
 * @version 1
 * @since 24.09.2018
 */
public interface Coach {

    /**
     * Method to print task from coach.
     * @return result
     */
    String getCoachTask();

    /**
     * Method to print daily fortune.
     * @return String result
     */
    String getDailyFortune();
}
