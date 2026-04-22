public class Member {
    String name;
    int age;
    int subDay; // Підписка

    public Member(String name, int age, int subDay) {
        this.name = name;
        this.age = age;
        this.subDay = subDay;
    }
    void checkStatus(){
        System.out.println("Клієнт "+ name + ", залишилося днів підписки: "+ subDay);
    }
    int paySubscription(int addDay){
        subDay = subDay+addDay;
        return subDay;
    }
}
