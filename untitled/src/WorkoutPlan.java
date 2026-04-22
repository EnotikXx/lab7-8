public class WorkoutPlan {
    String planName;
    int durationMins; // Тривалість
    double calPerMin; //Калорій за хвилину

    public WorkoutPlan(String planName, int durationMins, double calPerMin) {
        this.planName = planName;
        this.durationMins = durationMins;
        this.calPerMin = calPerMin;
    }
    double CalcCalories() {
        return durationMins * calPerMin;
    }
    void addExercises(String... exercises){
        System.out.println("До плану " + planName + " додано вправи (всього " + exercises.length + "):");
        for (String x : exercises){
            System.out.println("- " + x);
        }
    }
}

