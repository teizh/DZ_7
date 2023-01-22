public class Main {
    public static void main(String[] args) {


        Hero[] heroes = {new Magic(), new Medic(),
                new Warrior()};

        for (int i = 0; i < heroes.length; i++) {
            ((Hero) heroes[i]).applySuperAbility();
            if (heroes[i] instanceof Medic) {
                ((Medic) heroes[i]).increaseExperience();
            }

        }


    }

}