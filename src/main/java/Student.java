public class Student {

  private String Name;
  private int Age;

  public Student(String name, string nazw, int age) {
    Name = name;
    Age = age;
    Nazw = nazw;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetNazw() {return Nazw;}

  public String ToString() {
    return Name + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 2) 
      return new Student("Parse Error", -1);
    return new Student(data[0], Integer.parseInt(data[1]));
  }
}