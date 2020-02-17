package Object_Oriented_Programming;

// 让我们来创建一个人类的程序, let's create people!

public class Human {

    // define the properties of Human

    String name;
    String gender;
    int age;

    // let's create the constructor
    public Human(String n){
        this.name = n;
    }

    // let's create the methods to define the name, gender and age for Human
    public void setName(String n) {
        this.name = n;
    }

    public void setGender(String s){
        this.gender = s;
    }

    public void setAge(int a){
        this.age = a;
    }

    //
    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[]args){
        Human person1 = new Human("Wentao Ma");
        Human person2 = new Human("Martin");
        Human person3 = new Human("Candice");

        person1.setAge(25);
        person1.setGender("male");
        person2.setAge(25);
        person2.setGender("male");
        person3.setAge(24);
        person3.setGender("female");

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old" );
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old" );
        System.out.println(person3.getName() + " is " + person3.getAge() + " years old" );
    }
}
