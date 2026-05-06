public class Trainer {
    private String name;
    private int experience; // Досвід
    private double  rate; // Ставка за годину

    public Trainer(String name, int experience, double rate) {
        this.name = name;
        this.experience = experience;
        this.rate = rate;
    }

    public void displayDetails() {
        System.out.println("[Деталі] Тренер: " + name + ", Досвід: " + experience + " років.");
    }
    public double calculete(int hours){
        return rate*hours;
    }
    public double calculete(double hours){
        return rate*hours;
    }
    void assessMember(Member o){
        System.out.println("Тренер " + name +" аналізує профіль клієнта: "+ o.getName());
        if (o.getAge() < 18){
            System.out.println(" -> Рекомендовано підліткову програму тренувань.");
        }else System.out.println(" -> Рекомендовано звичайну програму тренувань.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
