public class Main {
    public static void main(String[] args) {
        Person[] arr = getPeople();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].age >= 40){
                arr[i].info();
            }

        }

    }

    private static Person[] getPeople() {
        Person[] arr = new Person[5];
        arr[0] = new Person("Vitaly Volkov", "Constructor","vitalya177@mail.ru",
                "89153263547", 30000, 42);
        arr[1] = new Person("Sergei Demerchuk", "Manager", "segeja97@mai.ru",
                "89169645347", 25000, 33);
        arr[2] = new Person("Vyacheslav Shatorin", "Tester", "slavaM@mail.ru",
                "89456374612", 27000, 56);
        arr[3] = new Person("Maria Kruglova", "Designer", "mashkaL2707@mail.ru",
                "89163524379", 31000, 24);
        arr[4] = new Person("Ignaty Milyutinsky", "Director", "igant87@mail.ru",
                "89123676458", 77000, 47);
        return arr;
    }
}

