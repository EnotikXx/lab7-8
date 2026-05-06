public class FitnessCenter {
    public static void main(String[] args) {
        Trainer t1 = new Trainer("Влад",5, 450.0);
        Trainer t2 = new Trainer("Олег",3, 300.0);
       // WorkoutPlan p1 = new WorkoutPlan("Кардіо",45, 8.5);
        // 4 варіанти конструктора
        Member m1 = new Member("Анна", 20, 5);          // Звичайний
        Member m2 = new Member();                           // через сеттери
        m2.setName("Ігор"); m2.setAge(25); m2.setSubDay(10);
        Member m3 = new Member("Олена");                  // З одним параметром
        Member m4 = new Member(m1);// Клон
        m1.displayDetails();
        m2.displayDetails();
        m3.displayDetails();
        m4.displayDetails();

        System.out.println();

        m2.setAge(26);
        System.out.println("Оновлений вік Ігоря (через Getter): " + m2.getAge());

        System.out.println();

        System.out.println("Зарплата за 20 рівних годин: " + t1.calculete(20) + " грн");
        System.out.println("Зарплата за 20.5 годин: " + t1.calculete(20.5) + " грн");

        WorkoutPlan p1 = new WorkoutPlan("Кардіо", 45, 8.5);

        t1.displayDetails();
        m1.displayDetails();
        p1.displayDetails();

        System.out.println();
        t1.assessMember(m1);
        p1.addExercises("Біг на доріжці", "Стрибки на скакалці");

        System.out.println();

        System.out.println();
        int newDays = m1.paySubscription(5);
        System.out.println("Оновлено підписку. Тепер доступно днів: "+ newDays);

        System.out.println();

        System.out.println("Клас WorkoutPlan");
        double burned = p1.calcCalories();
        System.out.println("Очікувана кількість спалених калорій: "+burned);
    }
}