class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private String job;

   // Constructor of the class...


   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("and my age is " + age);
      System.out.println("and I'm a " + job + " for a living");
      commentAboutAge();
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("damn you're old!");
      }
   }
   public void growOlder() {
      age++;
   }
   public void growOlderBy(int years) {
      age += years;
   }
   public void giveKnighthood() {
      name = "Sir " + name;
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();
      wp.growOlder();
      ls.growOlderBy(10);
      ls.talk();
      wp.talk();
      System.out.println("the age of Luke is " + ls.age);

   }

}
