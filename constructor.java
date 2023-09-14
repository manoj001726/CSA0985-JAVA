class c4{
  private String name;

  
c4() {
    System.out.println("Constructor Calling:");
    name = "yash";
  }

  public static void main(String[] args) {

  
    c4 obj = new c4();
    System.out.println(" hello  " + obj.name);
  }
}