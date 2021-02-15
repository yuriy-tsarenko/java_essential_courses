class Student {
    private String name;
    private String lastName;
    private byte age;
    private String username;
    private long id;
    private String phone;
    private String email;

    Student(String name, String lastName, byte age, String username, long id, String phone, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.username = username;
        this.id = id;
        this.phone = phone;
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Igor", "Rudenko", (byte) 14, "IgorVech", 1234567890l, "+380955654765", "IgorRudenkoForSlacks@gmail.com"),
                new Student("Iryna", "Viktorovna", (byte) 19, "IrynaVik", 2556534672l, "+380979719112", "IrynaVec@gmail.com"),
                new Student("Mihail", "Kolesnik", (byte) 16, "MihaK", 3572362583l, "+380635037291", "KolesnikMiha@gmail.com"),
                new Student("Max", "Naboshenko", (byte) 21, "Maxx", 8426834683l, "+88005553535", "MaxNaboshenko@gmail.com")
        };
    }
}