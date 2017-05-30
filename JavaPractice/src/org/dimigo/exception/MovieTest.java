package org.dimigo.exception;

public class MovieTest {

	public static void main(String[] args) throws Exception {
		Movie[] movies = {
				new Movie("에일리언:커버넌트", 15),
				new Movie("가디언즈 오브 갤럭시", 12)
		};
		
		int age = 13;
		
		for(Movie movie : movies){
			try{
				movie.buyTicket(age);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			
		}
		
	}

}
