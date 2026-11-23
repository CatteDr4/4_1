public class Student {

  private String Name;
  private int Age;
  private String LastName;
  private int Index;

  public Student(String name, int age, String lastName, int index) {
    Name = name;
    Age = age;
    LastName = lastName;
    Index = index;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetLastName() {return LastName;}
  public int GetIndex() {return Index;}

  public String ToString() {
    return Integer.toString(Index) + ": " + Name + " " + LastName + " " + Integer.toString(Age);
  }

  public String ToDBString() {
    return Integer.toString(Index) + ";" + Name + ";" + LastName + ";" + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(";");
    if(data.length != 4) 
      return new Student("Parse Error", -1, "-", -1);
    return new Student(data[1], Integer.parseInt(data[3]), data[2], Integer.parseInt(data[0]));
  }
}