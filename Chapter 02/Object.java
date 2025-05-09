class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

public class Object{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("홍길동", 20);
        Person p3 = p1.clone();

        System.out.println("p1: " + p1.toString());

        System.out.println("p1.equals(p2): " + p1.equals(p2));

        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());

        System.out.println("p1.getClass(): " + p1.getClass());

        System.out.println("p3: " + p3.toString());
        System.out.println("p1 == p3: " + (p1 == p3));
        System.out.println("p1 == p3: " + p3.equals(p1));
    }
}