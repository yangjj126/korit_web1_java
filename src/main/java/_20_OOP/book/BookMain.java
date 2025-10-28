package _20_OOP.book;

import java.util.Scanner;

// 서버 : 데이터를 운송하는 것
// Main의 역할 = 사용자 UI(프론트엔드) + 컨트롤러(백엔드)
// 사용자의 입/출력, 프로그램 흐름만 제어
// 세부로직은 Service에 구현, DB접근은 Repository에 구현

// 데이터의 흐름 :
// 사용자 UI(프론트엔드) -> 서버로 와서 1.Main역할을 하는 곳(컨트롤러) -> 2.서비스 -> 3.레포지토리 -> DB
// layer 아키텍처

public class BookMain {
    public static void main(String[] args) {

        // Book 객체는 어떻게 저장되는가
        // 과정 정리 :
        // BookMain의 main 메서드에서 생성
        // -> bookService
        // -> bookRepository


        //사용자 입력을 받아 줄 스캐너 생성
        Scanner scanner = new Scanner(System.in);
        // 서비스에 필요한 객체를 모두 생성
        Book[] books = new Book[5]; //책정보 저장할 배열 무조건 5개까지만 저장을 할 수 가 있다
        // bookRepository가 books를 알게됨
        BookRepository bookRepository = new BookRepository(books);
        // bookService가 bookRepository를 알게됨
        BookService bookService = new BookService(bookRepository); //그다음부분 못적음


        while(true){
            System.out.println("--도서관리 시스템--");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 목록 조회");
            System.out.println("q. 프로그램 종료");

            System.out.println("메뉴선택 >>");
            // 1~2 혹은 q입력
            String selectMenu = scanner.nextLine();
            if ("1".equals(selectMenu)){
                // 객체로 포장해서 입력
                String title;
                String author;
                // 비어있는게 없다면
                if (!bookService.isEmpty()){
                    System.out.println("등록 불가: 공간 없음");
                    continue;
                }

                //사용자로부터 입력을 받음
                System.out.println("책 제목 입력 >");
                title = scanner.nextLine();
                System.out.println("책 저자 입력>");
                author = scanner.nextLine();

                // 파편화된 데이터들을 객체로 포장
                Book book = new Book(title, author);
                bookService.append(book);

            } else if ("2".equals(selectMenu)){ //2. 전체도서 조회
                bookService.printRegisteredBooks();
            } else if ("q".equals(selectMenu)){
                System.out.println("프로그램 종료");
            }
            else { // 나머지 입력 처리
                System.out.println("잘못 입력 하셨습니다");
            }
        }
    }
}
