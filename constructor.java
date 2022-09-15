/*public class constructor {
    
        int x;
      
        public constructor(int y) {
          x = y;
        }
      
        public static void main(String[] args) {
          constructor myObj = new constructor(5);
          System.out.println(myObj.x);
        }
      }
      */

      public class constructor {
        int modelYear;
        String modelName;
      
        public constructor(int year, String name) {
          modelYear = year;
          modelName = name;
        }
      
        public static void main(String[] args) {
            constructor myCar = new constructor(2026, "Audi");
          System.out.println(myCar.modelYear + " " + myCar.modelName);
        }
      }
      

