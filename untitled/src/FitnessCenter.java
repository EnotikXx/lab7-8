public class FitnessCenter {
    public static void main(String[] args) {
        Trainer t1 = new Trainer("Влад",5, 450.0);
        Trainer t2 = new Trainer("Олег",3, 300.0);
        Member m1 = new Member("Оля",17, 5  );
        WorkoutPlan p1 = new WorkoutPlan("Кардіо",45, 8.5);

        System.out.println("Клас Trainer");
        t1.DisplayTrainer();
        double salary = t1.calculete(8);
        System.out.println("Зарплата за 8 годин: " + salary + "грн");

        System.out.println();

        t2.DisplayTrainer();
        double salary1 = t2.calculete(8);
        System.out.println("Зарплата за 8 годин: " + salary1 + "грн");

        System.out.println();

        t1.assessMember(m1);

        System.out.println();

        System.out.println("кЛАС Member");
        m1.checkStatus();
        int newDays = m1.paySubscription(5);
        System.out.println("Оновлено підписку. Тепер доступно днів: "+ newDays);

        System.out.println();

        System.out.println("Клас WorkoutPlan");
        double burned = p1.CalcCalories();
        System.out.println("Очікувана кількість спалених калорій: "+burned);
        p1.addExercises("Біг на доріжці", "Стрибки на скакалці", "Велотренажер");
    }
}