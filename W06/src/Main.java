public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        //Đặc biệt
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        //animal1.bark(); //lỗi
        //animal2.bark(); //lỗi
        Dog dog1 = (Dog)animal1;
        Cat cat1 = (Cat)animal2;
        //((Dog)animal1).bark(); //Đúng
        //((Cat)animal2).bark(); //Đúng
        //Cat cat2 = new Animal();//lỗi
    }
}