class Main {
  public static void main(String[] args)
   {
    
    String i = "Biryani";
    String str1 ="Biryani";
    String str2 = "meals";

    boolean result = i.contains(str1);
    if(result) {
      System.out.println(str1 + " is present in the string.");
    }
    else {
      System.out.println(str1 + " is not present in the string.");
    }

    result = i.contains(str2);
    if(result) {
      System.out.println(str2 + " is present in the string.");
    }
    else {
      System.out.println(str2 + " is not present in the string.");
    }
  }
}