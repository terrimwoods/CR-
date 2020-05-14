public class User {
  
    //attribiutes; name and age
    String name;
    int age;
//method
    public User(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void setAge(int age){
        if(age<100){
            this.age=age;
        }
        else{
            System.out.println("Error****Age is not correct");
        }
    }
    public void printUser(){
        System.out.println("-------New User-------");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age+"years old");
    }
    
    
}