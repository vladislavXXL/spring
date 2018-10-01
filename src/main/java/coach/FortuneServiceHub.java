package coach;

/**
 * Class FortuneServiceHub used to get some random fortuneService.
 * @author v.ivanov
 * @version 1
 * @since 01.10.2018
 */
public class FortuneServiceHub implements FortuneService {

    /**
     * Field fortuneServices array.
     */
    private FortuneService[] fortuneServices = new FortuneService[]{new HappyFortuneService(), new RainyFortuneService(), new SunnyFortuneService() };

    /**
     * Method getFortune().
     * @return String result
     */
    @Override
    public String getFortune() {
        return fortuneServices[(int) (Math.random() * fortuneServices.length)].getFortune();
    }


}
