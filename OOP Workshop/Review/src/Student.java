public class Student {
    //Below are the members/fields of the class, "Student"
    private String name;
    private int age;
    private String school;
    public String Major; //Note that I have intentionally left Major as a public field.

    //Below is the constructor of the class, "Student"
    public Student (String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        Major = m;
    }

    //Belows are methods that allows the user to access the fields of name, age, and school.
    //Note that we do not need a "getter" for Major, because it is a public field.
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getSchool() {return school;}

    //Below is a method that allows the user to modify the field, "school".
    //You'll need this method for the review exercise.
    public void setSchool(String newSchool) {school = newSchool;}
}
