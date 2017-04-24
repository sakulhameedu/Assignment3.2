class example {   //class name 
 int x; int y;     //declaring instance variable 
 String name;
 public static void main(String args[]) {
 example pnt = new example();  //calling main class Example 
 System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);  //printing result 
} }


//REsult : d. The program prints pnt is null 0 0

//REason:Instance variable of type int and String are initialized to 0 and null respectively
