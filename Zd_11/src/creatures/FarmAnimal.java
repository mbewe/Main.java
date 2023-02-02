package creatures;
import devices.*;

public class FarmAnimal extends Animal implements Edible{

    public FarmAnimal(String specie) {
        super(specie);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        System.out.println("Mniam !");
    }


}
