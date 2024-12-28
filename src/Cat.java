import java.util.Random;

public class Cat {

    public Cat(){

    }

    private void Sleep(){
        System.out.println("Sleep");
    }

    private void Eat(){
        System.out.println("Eat");
    }

    private void Meow(){
        System.out.println("Meow");
    }

    public void status(){
        Random rand = new Random();
        int number =  rand.nextInt(1, 4);

        if (number == 1){
            Sleep();
        } else if (number == 2) {
            Eat();
        }
        else {
            Meow();
        }
    }

}
