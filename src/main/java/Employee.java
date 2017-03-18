/**
 * Created by eduardocucharro on 17/03/17.
 */
class Employee implements Comparable {

    private int mNumber;
    private String mFirstName, mLastName, mEmail;

    public Employee(int number, String firstName, String lastName, String email) {
        mNumber = number;
        mFirstName = firstName;
        mLastName = lastName;
        mEmail = email;
    }

    public int compareTo(Object o) {
        Employee e = (Employee) o;
        boolean b = mNumber == e.getNumber();

        if(b) return 0;

        return mNumber > e.getNumber() ? 1 : -1;
    }

    public int getNumber() {
        return mNumber;
    }

    @Override
    public String toString() {
        return String.format("%1d %2s %3s %4s", mNumber, mFirstName, mLastName, mEmail);
    }
}
