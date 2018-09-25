package coach;

/**
 * Class CoachSwimming.
 * @author v.ivanov
 * @version 1
 * @since 25.09.2018
 */
public class CoachSwimming implements Coach {
    /**
     * Method to print task from coach.
     * @return result
     */
    @Override
    public String getCoachTask() {
        return "Swim 5 km in the sea.";
    }
}
