public class HomeWork {
    static Person findRichestPerson(Person persons[]) {
        int richestPersonInd = 0;
        for(int i = 0; i < persons.length; i++) {
            if (persons[i].balance > persons[richestPersonInd].balance) {
                richestPersonInd = i;
            }
        }
        return persons[richestPersonInd];
    }
    static Company findRichestCompany(Company companies[]) {
        int richestCompanyInd = 0;
        for(int i = 0; i < companies.length; i++) {
            int amount = companies[i].personsBalanceAmount();
            int richestCompanyAmount = companies[richestCompanyInd].personsBalanceAmount();
            if (amount > richestCompanyAmount) {
                richestCompanyInd = i;
            }
        }
        return companies[richestCompanyInd];
    }
    public static void main(String args[]) {
        // #7
        Person p1 = new Person("Dmitri", 100);
        Person p2 = new Person("Anna", 200);
        Person p3 = new Person("Vasya", 1000);
        Person p4 = new Person("Petya", 100);
        Person p5 = new Person("Ivan", 400);
        Person p6 = new Person("Olya", 300);
        Person[] ps = {p1, p2, p3, p4};
        Person richestPerson = findRichestPerson(ps);
        System.out.println(
                String.format(
                        "Richest person name is %s and balance is %d",
                        richestPerson.name,
                        richestPerson.balance
                )
        );

        // #8
        Person comA[] = { p1, p4, p5 };
        Person comB[] = { p2, p3, p6 };
        Company A = new Company("Apple", comA);
        Company B = new Company("Microsoft", comB);
        Company cs[] = { A, B };
        Company richestCompany = findRichestCompany(cs);
        System.out.println(String.format("Richest company name is %s", richestCompany.name));
    }
}
