class Welcome1
{
  public void accept()
  {
              System.out.println("welcome in accept");
   }
   public void display()
   {
          System.out.println("welcome to delloite ");
        System.out.println("welcome to itpl");
  }
    static public void main(String a[])
            {
         System.out.println("\nwelcome in main");
      Welcome1 w = new Welcome1();
             w.display();
             w.accept(); 
         Bye b= new Bye();
            b.sayBye();
}
}
class Bye 
    
{ 
  public void sayBye()
{
    System.out.println("bye bye c u tomm.....");
}
}
