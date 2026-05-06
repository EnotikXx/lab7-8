public class Member {
    private String name;
    private int age;
    private int subDay; // Підписка

    public Member(String name, int age, int subDay) {
        this.name = name;
        this.age = age;
        this.subDay = subDay;
    }

    public Member(){
    }

    public Member(String name){
        this.name = name;
        this.age = 0;
        this.subDay = 0;
    }
    public  Member(Member other){
        this.name = other.name;
        this.age = other.age;
        this.subDay = other.subDay;
    }

    public void displayDetails() {
        System.out.println("[Деталі] Клієнт: " + name + " (Вік: " + age + "). Підписка: " + subDay + " днів.");
    }
    int paySubscription(int addDay){
        subDay = subDay+addDay;
        return subDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSubDay() {
        return subDay;
    }

    public void setSubDay(int subDay) {
        this.subDay = subDay;
    }
}
