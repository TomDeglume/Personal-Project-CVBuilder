public class Person{
    String first_name;
    String last_name;
    int age;

    public Person(String first_name, String last_name, int age){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public void display(){
        System.out.println("Last name : " + last_name + ", First_name : " + first_name +  ", Age : " + age );
    }
}
