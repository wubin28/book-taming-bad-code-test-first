package tbc.testfirst;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-4-25.
 */
public class HotelWorldClocksTest {
    @Test
    public void the_time_of_London_clock_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time() {
        assertEquals(1, londonClock.getLocalTime());
    }
}
