public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Student){
            Student std = (Student) obj;
            return this.name.equals(std.name) && this.age = std.age;
        }
        return false;
    }

    public static void main(String[] args) {
        Student s1 = new Student ("Hung", 19);
        Student s2 = new Student ("Hung", 19);

        System.out.println(s1.equals(s2));
    }
}
