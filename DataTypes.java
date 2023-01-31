public class DataTypes {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 2000; // -32,768 to 32,767
        int anInteger = 2147483645; // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        // decimal types
        double aDouble = 1.73278; //8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        float aFloat = 3.4028F; //4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

        // booleans
        boolean isWeeknd = false;
        boolean isWorkday = true;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println("This is the copyright symbol: " + copyrightSymbol);
    }
}
