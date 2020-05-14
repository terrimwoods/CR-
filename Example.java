public class Example {

    public static void main(String[] args) {
        //object interaction

        User shay = new User("Shay", 21);
       //second object
        User emeke = new User ("Emeke", 32);
       
        //display the object
        shay.printUser();
        //display second object
        emeke.printUser();


    Student nora = new Student ("Nora" ,22,9);
    nora.printStudent();

    //print second student
    Student briun = new Student ("Briun" , 28,7);
    briun.printStudent();
    
    //creat animal
    Animal bobcat = new Animal ("hungry", "Bobcat");
    bobcat.printAnimal();
    Animal honeybadger = new Animal ("relentless",  "Honey badger");
    honeybadger.printAnimal();

    bobcat.attacks(shay);
    honeybadger.attacks(emeke);
        
    }
}