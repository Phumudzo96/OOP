public class School
{
   public static void main (String [] args)
   {
   
      Student sally = new Student("Sally", 15, 8, 'D');
      Student sipho = new Student("Sipho", 17 , 11, 'A');
      Student rajesh = new Student("Rajesh", 19, 12, 'B');
      
      System.out.println("Students\n");
      System.out.println(sally + "\n");
      System.out.println(sipho + "\n");
      System.out.println(rajesh);

      Teacher teacher1 = new Teacher("Mary", 25, "History", 6, 11);
      Teacher teacher2 = new Teacher("Thando", 40, "Art", 3, 12);
      Teacher teacher3 = new Teacher("John", 45, "Maths", 6, 8);

      System.out.println("Teachers\n");
      System.out.println(teacher1 + "\n");
      System.out.println(teacher2 + "\n");
      System.out.println(teacher3);

      Secretary secretary1 = new Secretary("Lisa", "Female", 22, "J and B day spa", 2018);
      Secretary secretary2 = new Secretary("Isa","Female" , 26, "OR Tambo Int", 2014);
      Secretary secretary3 = new Secretary("Jane", "Female", 30, "Sun Hotel", 2010);

      System.out.println("Secretary\n");
      System.out.println(secretary1 + "\n");
      System.out.println(secretary2 + "\n");
      System.out.println(secretary3);
      }
}