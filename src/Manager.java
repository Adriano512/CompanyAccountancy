public class Manager extends Worker{

    public int salary;

    public Manager(String name, String surname, double etat, int salary) {
        super(name, surname, etat);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
    String getSurname () {
        return surname;
    }

    public String printable () {
        return surname + " " + name ;
    }
}
