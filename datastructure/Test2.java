package datastructure;

	class User {
		int user_id;
		String user_name;
		
		public User(int user_id, String user_name) {
			super();
			this.user_id = user_id;
			this.user_name = user_name;
		}
	}
	public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] user;
		user = new User[5];
		user[0] = new User(101,"nivas");
		user[1] = new User(102,"nivas");
		user[2] = new User(103,"glory");
		user[3] = new User(104,"shilpa");
		user[4] = new User(105,"aariz");
		for(int i=0;i<user.length;i++) {
			System.out.println(i + " " + user[i].user_id+ " " + user[i].user_name);
		}

	}

}
