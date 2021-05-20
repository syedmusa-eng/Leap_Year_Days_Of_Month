public class NumberOfDaysInMonth {

    //Creating method to check the leap year.
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    //Creating a method to get the days in months.
    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            if ((isLeapYear(year)) && month == 2) {
                return 29;
            } else {
                int days;
                switch (month) {
                    case 1:
                        days = 31;
                        break;
                    case 2:
                        days = 28;
                        break;
                    case 3:
                        days = 31;
                        break;
                    case 4:
                        days = 30;
                        break;
                    case 5:
                        days = 31;
                        break;
                    case 6:
                        days = 30;
                        break;
                    case 7:
                        days = 31;
                        break;
                    case 8:
                        days = 31;
                        break;
                    case 9:
                        days = 30;
                        break;
                    case 10:
                        days = 31;
                        break;
                    case 11:
                        days = 30;
                        break;
                    case 12:
                        days = 31;
                        break;
                    default:
                        days = -1;
                }
                return days;
            }
        }
    }
}
