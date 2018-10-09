/**
 * Class for student information.
 */
class StudentInfo implements Comparable<StudentInfo> {
    /**
     * studentname of type String.
     */
    private String studentname;
    /**
     * year of type int.
     */
    private int year;
    /**
     * month of type int.
     */
    private int month;
    /**
     * date of type int.
     */
    private int date;
    /**
     * marks1 of type int.
     */
    private int marks1;
    /**
     * marks2 of type int.
     */
    private int marks2;
    /**
     * marks3 of type int.
     */
    private int marks3;
    /**
     * totalmarks of type int.
     */
    private int totalmarks;
    /**
     * reservationcat of type String.
     */
    private String reservationcat;
    
    StudentInfo() {

    }
    /**
     * Constructs the object.
     * @param      n      studentname.
     * @param      y      year.
     * @param      m      month.
     * @param      d      day.
     * @param      m1     The m 1
     * @param      m2     The m 2
     * @param      m3     The m 3
     * @param      total  The total
     * @param      r      reservationcat.
     */
    StudentInfo(final String n, final int y, final int m,
        final int d, final int m1, final int m2,
        final int m3, final int total, final String r) {
        studentname = n;
        year = y;
        month = m;
        date = d;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        totalmarks = total;
        reservationcat = r;
    }
    String getreservationcat() {
        return reservationcat;
    }
    /**
     * compareTo method.
     * @param      s     StudentInfo object.
     * @return     int.
     */
    public int compareTo(final StudentInfo s) {
        if (totalmarks > s.totalmarks) {
            return 1;
        }
        if (totalmarks < s.totalmarks) {
            return -1;
        }
        if (marks3 > s.marks3) {
            return 1;
        }
        if (marks3 < s.marks3) {
            return -1;
        }
        if (marks2 > s.marks2) {
            return 1;
        }
        if (marks2 < s.marks2) {
            return -1;
        }
        if (year > s.year) {
            return 1;
        }
        if (year < s.year) {
            return -1;
        }
        if (month > s.month) {
            return 1;
        }
        if (month < s.month) {
            return -1;
        }
        if (date > s.date) {
            return 1;
        }
        if (date < s.date) {
            return -1;
        }
        return 0;
    }
    /**
     * Returns a string representation of the object.
     * @return     String representation of the object.
     */
    public String toString() {
        return studentname + "," +
        Integer.toString(totalmarks) + "," + reservationcat;
    }
}
