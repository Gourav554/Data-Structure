
class Student {
    int age;
}
//Durse ka variable store karne ke liye memory allocate karta hai, uske address ko pointer kehte hai. Pointer se hum us variable ko access kar sakte hai.
//It is a Referance variable
public class Pointer {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 20;
        System.out.println(s1.age);
    }
}

