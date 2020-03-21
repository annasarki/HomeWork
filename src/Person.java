class Person {
    String name;
    int balance;
    String company;
    public Person(String _name, int _balance) {
        name = _name;
        balance = _balance;
    }
    public Person(String _name, int _balance, String _company) {
        name = _name;
        balance = _balance;
        company = _company;
    }
    public void personInfo() {
        System.out.println(String.format("Name is %s, balance is %d", name, balance));
    }
    public void companyInfo() {
        System.out.println(String.format("Person's company %s", company));
    }
    public void sendMoney(Person reciever, int amount) {
        if (balance == 0) {
            System.out.println("You don't have a money");
            return;
        }
        if (balance - amount <= 0) {
            System.out.println("You don't have enough money");
            return;
        }

        balance -=amount;
        reciever.balance +=amount;
    }
    public void setCompany(String _company) {
        company = _company;
    }
}





