package _24_Inheritance.animal;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }


    public void eat(){
        System.out.println("동물이 음식을 먹습니다");
    }

    public void showInfo() {
        System.out.println("이름 : "+ this.name);
        System.out.println("나이 : " + this.age);
    }


}
