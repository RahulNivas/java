package datastructure;

class User1{
	public String username;
	User1 (String username){
		this.username=username;
	}
	public String toString() {
		return "User1 [username= " +username +"] ";
	}
	
}


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number [] = new int [] {10,20,30,40,50};
		for( int i=0; i<number.length;i++) {
			System.out.println(i + " " + number[i]);
		}
		System.out.println("======================");
		User1[] users= new User1[] { new User1("rahul"),new User1("nivas"), new User1("rajan")};
		for (User1 u : users) {
			System.out.println(u);
		}

	}

}
