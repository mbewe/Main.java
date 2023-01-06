package creatures;

public class FarmAnimal extends Animal implements Edible{
    FarmAnimal(String specie) {

        super(specie);
    }

    @Override
    public void beEaten() throws Exception {

    }

    @Override
    public boolean isPoisoned() {
        return false;
    }
}
