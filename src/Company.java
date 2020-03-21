public class Company {
    String name;
    Person persons[];
    public Company(String _name) {
        name = _name;
    }
    public Company(String _name, Person _persons[]) {
        name = _name;
        persons = _persons;
        appendToCompany();
    }
    private void appendToCompany() {
        for(int i = 0; i< persons.length; i++) {
            persons[i].setCompany(name);
        }
    }
    public int personsBalanceAmount() {
        int sum = 0;
        for (int i = 0; i < persons.length; i++) {
            sum += persons[i].balance;
        }
        return sum;
    }
}
