public class Person {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;
    public Person(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println(name);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(salary);
        System.out.println(age);

    }
}
