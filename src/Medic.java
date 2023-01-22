public class Medic extends Hero implements HavingSuperAbility {
    public double healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность REVIVE A SOUL");
    }



    public void increaseExperience() {
        healPoints = healPoints * (1.1);
        System.out.println("Герой Medic получил опыт!");
    }
}
