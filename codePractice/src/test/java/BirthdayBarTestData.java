public class BirthdayBarTestData {
    private int[] input;
    private int day;
    private int month;

    public BirthdayBarTestData(int[] input, int day, int month){
        this.input = input;
        this.day = day;
        this.month = month;
    }

    public int[] getInput() {
        return input;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
