public class Main {
    public static void main(String[] args) {
        //Initializing instances with constructor (i.e. creating objects)
        Student Harim = new Student ("Harim", 23, "MCAS", "Computer Science");
        Student Jason = new Student ("Jason", 23, "CSOM", "Accounting");

        //Notice that I did not use a getter method for the majors.
        //This section of the code prints the information of each student.
        System.out.println("Name: " + Harim.getName() + '\n' + "Age: " + Harim.getAge() + '\n' +
                "School: " + Harim.getSchool() + '\n' + "Major: " + Harim.Major + '\n');
        System.out.println("Name: " + Jason.getName() + '\n' + "Age: " + Jason.getAge() + '\n' +
                "School: " + Jason.getSchool() + '\n' + "Major: " + Jason.Major + '\n');

        //Because the field "major" was public, we can access and modify them from the main class.
        Harim.Major = "Philosophy";
        Jason.Major = "Finance";

        System.out.println("Name: " + Harim.getName() + '\n' + "Age: " + Harim.getAge() + '\n' +
                "School: " + Harim.getSchool() + '\n' + "Major: " + Harim.Major + '\n');
        System.out.println("Name: " + Jason.getName() + '\n' + "Age: " + Jason.getAge() + '\n' +
                "School: " + Jason.getSchool() + '\n' + "Major: " + Jason.Major + '\n');

        /*Based on the code and what we've discussed so far, make adjustments to the code so that
        instead of changing each student's majors, it changes the schools that they attend at Boston College.
        i.e. Harim becomes a "CSOM" student and Jason becomes an "MCAS" student.*/
    }
}