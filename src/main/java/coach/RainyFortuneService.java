package coach;

/**
 * Used to get any fortuneService instance.
 * @author v.ivanov
 * @version 1
 * @since 30.09.2018
 */
public class RainyFortuneService implements FortuneService {

    /**
     * Method getFortune().
     * @return String result
     */
    @Override
    public String getFortune() {
        return "Today is raining!";
    }
}
