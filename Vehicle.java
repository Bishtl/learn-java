
    // inhertance
    
    
    
    class Vehicle {
        protected String brand = "audi";        
        public void honk() {                   
          System.out.println("truck");
        }
      }
      
      class Car extends Vehicle {
        private String modelName = "thar";   
        public static void main(String[] args) {
      
         
          Car myCar = new Car();
      
          myCar.honk();
      
         
          System.out.println(myCar.brand + " " + myCar.modelName);
        }
      }
