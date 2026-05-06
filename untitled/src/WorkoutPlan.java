public class WorkoutPlan {
    private String planName;
    private int durationMins; // Тривалість
    private double calPerMin; //Калорій за хвилину

    public WorkoutPlan(String planName, int durationMins, double calPerMin) {
        this.planName = planName;
        this.durationMins = durationMins;
        this.calPerMin = calPerMin;
    }
    public void displayDetails() {
        System.out.println("[Деталі] План тренувань: '" + planName + "', Тривалість: " + durationMins + " хв.");
    }

    public double calcCalories() {
        return durationMins * calPerMin;
    }
    public void addExercises(String... exercises){
        System.out.println("До плану " + planName + " додано вправи (всього " + exercises.length + "):");
        for (String x : exercises){
            System.out.println("- " + x);
        }
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getDurationMins() {
        return durationMins;
    }

    public void setDurationMins(int durationMins) {
        this.durationMins = durationMins;
    }

    public double getCalPerMin() {
        return calPerMin;
    }

    public void setCalPerMin(double calPerMin) {
        this.calPerMin = calPerMin;
    }
}

