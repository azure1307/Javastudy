package test0401;

/*
구동 클래스 실행시 다음의 결과가 나오도록 
DataAccessObject 인터페이스와 OracleDao,MySqlDao 클래스를 구현하기.

[결과]
Oracle DB에서 검색
Oracle DB에 삽입
Oracle DB에 수정
Oracle DB에서 삭제
Mysql DB에서 검색
Mysql DB에 삽입
Mysql DB에 수정
Mysql DB에서 삭제 
 */
interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject {
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	public void update() {
		System.out.println("Oracle DB에 수정");
	}
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
class MySqlDao implements DataAccessObject {
	public void select() {
		System.out.println("MySQL DB에서 검색");
	}
	public void insert() {
		System.out.println("MySQL DB에 삽입");
	}
	public void update() {
		System.out.println("MySQL DB에 수정");
	}
	public void delete() {
		System.out.println("MySQL DB에서 삭제");
	}
}
public class Test5 {
	public static void main(String[] args) {
	      dbWork(new OracleDao());
	      dbWork(new MySqlDao());
	}
   private static void dbWork(DataAccessObject dao) {
         dao.select();
         dao.insert();
         dao.update();
         dao.delete();
   }
}
