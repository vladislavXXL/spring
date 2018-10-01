package coach;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class SetterXmlTest used to test setter injection.
 * @author v.ivanov
 * @version 1
 * @since 26.09.2018
 */
public class SetterXmlTest {

    /**
     * Method to test setter injection.
     */
    @Test
    public void whenSetterInjection() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CoachCricket coach = context.getBean("myCricketCoach", CoachCricket.class);
        System.out.println(coach.getCoachTask());
        System.out.println(coach.getDailyFortune());
        System.out.println("Email: " + coach.getEmailAddress() + ", team: " + coach.getTeam());
        context.close();
    }

    /**
     * Bean with random generated field fortuneService testing.
     */
    @Test
    public void whenFortuneServiceIsRandom() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CoachFootball coach = context.getBean("footballCoach", CoachFootball.class);
        System.out.println(coach.getCoachTask());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
