import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HackerRankPracticeTest {

    HackerRankPractice hackerRankPractice = new HackerRankPractice();

    @Test
    void testIntegerParse() {
        List<String> inputList = Arrays.asList("101", "10", "0","-11","1999",
                "-2010");


        for (String input:inputList){
            int expected = Integer.valueOf(input);
            int actual = hackerRankPractice.convertToInt(input);
            System.out.format("Input:%s, expected:%d, actual:%d ", input, expected, actual);
            assertEquals(expected,actual);
        }
    }

    @Test
    void testRotate(){
        int[] input = {2,4,6,8,3};
        int[] expected = {6,8,3,2,4};
        int[] actual = hackerRankPractice.rotate(input, 2);
        TestUtils.assertIntegerArrays(expected,actual);

    }

    @Test
    void birthdayBarTestCase1(){
        int[] chocolateBars = {1,2,1,3,2};
        BirthdayBarTestData birthdayBarTestData
                = new BirthdayBarTestData(chocolateBars,3,2);
        TestUtils.testBirthdayBars(birthdayBarTestData,2);
    }

    @Test
    void birthdayBarTestCase2(){
        int[] chocolateBars = {1,1,1,1,1};
        BirthdayBarTestData birthdayBarTestData
                = new BirthdayBarTestData(chocolateBars,3,2);
        TestUtils.testBirthdayBars(birthdayBarTestData,0);
    }

    @Test
    void birthdayBarTestCase3(){
        int[] chocolateBars = {4};
        BirthdayBarTestData birthdayBarTestData
                = new BirthdayBarTestData(chocolateBars,4,1);
        TestUtils.testBirthdayBars(birthdayBarTestData,1);
    }

    @Test
    void dataTypeTest(){
        int baseInteger = 4;
        double baseDouble = 4.0;
        String baseString = "HackerRank";

        HackerRankPractice.addDataTypes();
    }

}
