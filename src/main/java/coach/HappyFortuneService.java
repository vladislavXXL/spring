package coach;

/**
 * Class HappyFortuneService.
 * @author v.ivanov
 * @version 1
 * @since 25.09.2018
 */
public class HappyFortuneService implements FortuneService {

    /**
     * Method getFortune().
     * @return String result
     */
    @Override
    public String getFortune() {
        return "Today is your lacky day!";
    }
}
