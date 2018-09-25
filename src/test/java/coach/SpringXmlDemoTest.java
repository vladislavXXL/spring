package coach;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class to demonstrate spring xml configuration.
 */
public class SpringXmlDemoTest {

    /** Context.*/
    private ClassPathXmlApplicationContext context;

    /**
     * Initialization block.
     */
    @Before
    public void init() {
        /** Load the spring configuration file.*/
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    /**
     * Run the bean methods.
     */
    @Test
    public void runBeanMethods() {
        /** Retrieve bean from spring container.*/
        Coach coach = this.context.getBean("myCoach", Coach.class);

        /** Call method getCoachTask().*/
        System.out.println(coach.getCoachTask());

        /** Call method getDailyFortune().*/
        System.out.println(coach.getDailyFortune());

    }

    /**
     * Close the context.
     */
    @After
    public void closeContext() {
        /** Close the context.*/
        this.context.close();
    }


}
