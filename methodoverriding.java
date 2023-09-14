class student
{  
  void run()
  {
      System.out.println("student is listening");}  
}  
class marks extends student
{  
  public static void main(String args[])
  {  
  marks obj = new marks();  
  obj.run();
}
}