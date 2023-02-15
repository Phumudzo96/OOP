public class Teacher {
    // Attributes
    String name;
    int age;
    String subject;
    int classes;
    int grade;
    
    // Methods
    public Teacher(String name, int age, String subject, int classes, int grade){
    
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.classes = classes;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject(){
        return subject;
    }

    public int getClasses(){
        return classes;
    }

    public int getGrade(){
        return grade;
    }

    public String toString() {
       String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nSubject: " + subject;
        output += "\nClasses: " + classes;
        output += "\nGrade: " + grade;
        
        return output;
    }


}

