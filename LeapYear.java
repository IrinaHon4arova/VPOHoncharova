public static boolean isLeapYear(int year) {

        // Write your code here
boolean isLeapYear;

        isLeapYear = year % 4 == 0;

        isLeapYear = isLeapYear && year % 100 != 0;

        return isLeapYear || year % 400 == 0;
    }
