public class Person {
    public String name;
    public int age;

    public  static void main(String arg[]){
        Person person;
        person = new Person("김미남");

        int i=person.age = 30;
        String s = person.getName();

        System.out.println(i);
        System.out.println(s);
    }
    public Person(){

    }
    public Person(String s){
        name = s;
    }
    public String getName() {
        return name;
    }
}
