import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 04-09-18.
 */
public class DriverTest {

    Driver d = new Driver();

    @org.junit.Test
    public void getEmailFromURL() throws Exception {
        //Checks the email address is being retrieved from the URL correctly.
        assertEquals(d.getEmailFromURL(),"blah@gmail.com");
    }

}