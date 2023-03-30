package sec02.예제;

public class OracleDao implements DataAccessObject  {

	
	 public void select() {
		System.out.println("Orcle DB에서 검색");
		
	}

	
	public void insert() {
		System.out.println("Orcle DB에 삽입");		
	}


	public void update() {
		System.out.println("Orcle DB를 수정");
		
	}

	
	public void delete() {
		System.out.println("Orcle DB에서 삭제");		
	}


	
		
	}


