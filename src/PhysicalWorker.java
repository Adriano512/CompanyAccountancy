public class PhysicalWorker extends Worker{

public int hoursWorked;

    public PhysicalWorker(String name, String surname, double etat, int hoursWorked) {
        super(name, surname, etat);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
    public String printable () {
        return surname + " " + name ;
    }

    String getSurname () {
        return surname;
    }
}
