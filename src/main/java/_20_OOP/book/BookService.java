package _20_OOP.book;

// 구체적으로 "무엇을 해야하는가"를 코드로 작성한다
public class BookService {
    BookRepository bookRepository;

    // 의존성? 정상작동하기 위해 반드시 필요한 객체
    // BookService의 객체는 BookRepository 객체에 의존하고 있다
    // 생성자를 통해서 의존하는 객체를 주입 -> 의존성 주입
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //책을 저장소에 추가
    void append(Book book){
        // Book이 중복되었는지?
        // 그외 여러 요구사항들을 코드로 처리한다
        bookRepository.insert(book);
    }

    //저장공간이 비어있는지 확인
    boolean isEmpty() {
        // 비어있으면 true반환
        int emptyIndex = bookRepository.getEmptyIndex();
        if (emptyIndex >= 0){
            return true;
        } else {
            return false;
        }
    }











//    // 등록된 도서를 콘솔로 출력
//    void printRegisteredBooks() {
//        // books -> 레파지토리가 리턴한 newBooks
////        Book[] books = bookRepository.getBooksDatas();
//
//        // 도서가 하나도 없을 경우
//        if (books.length == 0) {
//            System.out.println("등록된 도서가 없습니다");
//            return;
//        }
//
//
//        for (int i = 0; i < books.length; i++){
//            // 반복하면서, books배열에서 book을 하나씩 꺼낸다
//            Book book = books[i];
//            System.out.println(book.toString());
//        }
//
//
//    }

}
