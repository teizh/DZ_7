public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }

    @Override
    public void increaseExperience() {
        System.out.println("Герой Warrior получил опыт!");
    }
}
