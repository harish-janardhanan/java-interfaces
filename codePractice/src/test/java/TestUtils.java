import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUtils {

    static void assertIntegerArrays(int[] expected, int[] actual){
        assertEquals(expected.length,actual.length);
        for (int i = 0 ; i < expected.length ; ++i){
            assertEquals(expected[i],actual[i]);
        }
    }

    static void testBirthdayBars(BirthdayBarTestData birthdayBarTestData, int expected){


    int actual = HackerRankPractice.birthday(birthdayBarTestData.getInput(),
            birthdayBarTestData.getDay(),birthdayBarTestData.getMonth());
    assertEquals(expected,actual);


    }
}
