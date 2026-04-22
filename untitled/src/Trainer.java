public class Trainer {
    String name;
    int experience; // Досвід
    double  rate; // Ставка за годину

    public Trainer(String name, int experience, double rate) {
        this.name = name;
        this.experience = experience;
        this.rate = rate;
    }
    void DisplayTrainer()  {
        System.out.println("Тренер: "+name+", Досвід: "+experience+"роки");
    }
    double calculete(int hours){
        return rate*hours;
    }
    void assessMember(Member o){
        System.out.println("Тренер " + name +" аналізує профіль клієнта: "+ o.name);
        if (o.age < 18){
            System.out.println(" -> Рекомендовано підліткову програму тренувань.");
        }else System.out.println(" -> Рекомендовано звичайну програму тренувань.");
    }
}
