package momo.inheritance.statics;


class Main {

	public static void main(String[] args) {

		System.out.println(Parent.uniqueFriendName);
		Parent.meetFriend();
		
		System.out.println(Child.uniqueFriendName);
		Child.meetFriend();				

	}
} 

//1.부모만 코드 있을 때, 내껄로 불러본다. 상속이 되는구나
//2.내가 다시 선언했어, 내껄로 불러본다. 내꺼가 불러지는구나
//3.static 애들은 객체 만들지 않고 
//가지고 있는 클래스 이름으로 부르는게 정석이다.

//4.부모형으로 받고 이런거 하지 말아라! 
//아무런 효과도 없을 뿐더러 정신만 사나워진다.

//상속은 되나 static 애들은 특성상 클래스이름으로 불러다 쓰는게 정석.