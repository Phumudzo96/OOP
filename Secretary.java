public class Secretary {
     // Attributes
     String name;
     String gender;
     int age;
     String company;
     int matricYear;
 
     // Methods
     public Secretary(String name, String gender, int age, String company, int matricYear){
         this.name = name;
         this.gender = gender;
         this.age = age;
         this.company = company;
         this.matricYear = matricYear;
     }
 
     public String getName() {
         return name;
     }
 
     public String getGender(){
         return gender;
     }

     public int getAge(){
         return age;
     }

     public String getCompany(){
         return company;
     }

     public int getMatricYear(){
         return matricYear;
     }
    
     public String toString(){
         String output = "Name: " + name;
         output += "\nGender: " + gender;
         output += "\nAge: " + age;
         output += "\nCompany: " + company;
         output += "\nYear of matricalation: " + matricYear;

         return output;
     }
}
