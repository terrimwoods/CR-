public class Student extends User{
    
//public String name;
//public int age;
public int cohortNumber;

public Student(String name, int age, int cohortNumber){ 
    super(name, age);
    //this.name=name;
    //this.age=age;
    this.cohortNumber=cohortNumber;
}
    //create the print student method
    public void printStudent() {
        //System.out.println(this.name);
       // System.out.println(this.age);
       printUser();
       //System.out.println(this.cohortNumber);
    }
}