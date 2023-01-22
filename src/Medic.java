public class Medic extends Hero {
    public double healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность REVIVE A SOUL");
    }


    @Override
    public void increaseExperience() {
        healPoints = healPoints * (1.1);
        System.out.println("Герой Medic получил опыт!");
    }
}
