 class Car extends Vehicle {
     private int wheels;
     private String type;
     private int door;
     private int gears;
     private boolean isManual;
     private int currentGear;

     public Car(String name, int wheels, int door, int gears, boolean isManual, String type) {//Matching constructor needed for extending different class
         super(name);//Matching constructor needed for extending different class
         this.type = type;
         this.gears = gears;
         this.door = door;
         this.isManual = isManual;
         this.wheels = wheels;
         currentGear = 1;


     }

     public void changeGear(int newGear) {
         this.currentGear = newGear;
         System.out.println("changeGear method called:" + this.currentGear + "gear");

     }

     public void changeSpeed(int newSpeed, int newDirection) {
         move(newSpeed, newDirection);
         System.out.println("change speed meathod called: Speed ->" + newSpeed + "direction->" + newDirection);

     }

     public int getGears() {
         return gears;
     }
 }


