package coach;

/**
 * FortuneService implements sunny day.
 * @author v.ivanov
 * @version 1
 * @since 01.10.2018
 */
public class SunnyFortuneService implements FortuneService {

    /**
     * Method getFortune().
     * @return String result
     */
    @Override
    public String getFortune() {
        return "It is sunny today!";
    }
}
