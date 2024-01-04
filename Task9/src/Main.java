public class Main {
    String name;
    String surname;
    int age;
    String role;
    Boolean isActive;


    public Main(String name, String surname, int age, String role, Boolean isActive){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role = role;
        this.isActive = isActive;
    }

    private boolean setActive(Boolean isActive){
        return this.isActive = isActive;
    }

    public void introduceYourself(){
        if(this.isActive){
            System.out.println("Hello, my name is " + this.name + " " + this.surname + " and I am " + this.age + " years old.");
        } else {
            System.out.println("Sorry, this user is not active.");
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void packUsers(Main[] users){
//        for(int i=0; i<users.lenght;  i++){
//            users[i].introduceYourself();
//        }
        //swaggy way of looping through array
        for(Main user: users){
            user.introduceYourself();
        }
    }
}

