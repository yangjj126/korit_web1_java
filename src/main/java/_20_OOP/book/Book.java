package _20_OOP.book;

public class Book {
    String title;
    String author;

    // 생성자 : 메서드랑 비슷하지만, 리턴 타입x, 이름은 클래스와 동일해야한다
    // title과 author를 초기화하는 생성자를 만들어주세요

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    // 생성자 함수 빠르게 만들기
    // ALT + INSERT

    public String toString(){
        String bookInfo = "제목: " + title + System.lineSeparator() + ", 저자 : " + author;
        return bookInfo; //이거 맞냐 나중에 확인
    }
}
