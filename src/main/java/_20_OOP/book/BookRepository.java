package _20_OOP.book;
// 컨트롤 눌러서 메서드 누르면, 거기로 넘어간다
// Repository의 역할 : Db와 연결관리
// DB에서 데이터를 불러오는 역할
public class BookRepository {
    Book[] books;

    public BookRepository(Book[] books) {
        this.books = books;
    }

    // 아래의 메서드들은 차후애 SQL쿼리가 되어야 한다
    // sql쿼리 : database 언어

    void insert(Book book) {
        //비어잇는 인덱스를 모름
        int emptyIndex = getEmptyIndex();
        if (emptyIndex == -1) {
            System.out.println("현재 저장할 공간이 없습니다");
            return;
        }
        books[emptyIndex] = book;
        System.out.println(book.toString() + "저장완료");
    }

    int getEmptyIndex() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {   //books는 어떻게 형성된것인가.,......
                return i; // 이게 이제 getEmptyIndex를 통해서 emptyIndex로 값이 넘어간다
            }
        }
        return -1; //0을 포함한 양수가 아닌경우
    }

    // 등록된 도서들을 조회
    // 배열의 5칸을 만들어놨는데, 만약 2권만 등록되었다면,?
    // 배열의 길이만큼 순회하면, 에러가 발생할 수 있다
    // 5칸중에 실제 등록된 도서만 따로 모아서 새로운 배열만 반환할 것이다
    Book[] getBooksDatas() {
        // count 변수 만들기
        int count = 0;
        // 1. null이 아닌 도서의 갯수를 센다(count 활용)
        // 2. new Book[count]
        // 3. new Book 에다가 복사

    }




    //지금까지 한 내용을 아직 다 못적음....
    // 3.
//     int j = 0;
//     for (int i = 0; i<books.lenrth; i++){
//        if (books[i] != null){
//            newBooks[j] = books
//        }
//      }



}
