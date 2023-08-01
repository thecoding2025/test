package momo.inheritance.statics;

class Parent {

	// 정적변수 : 유일한 친구 이름
    static String uniqueFriendName = "홍길동";

    // 정적메소드 : 친구를 만나다.
	static void meetFriend() {
		System.out.println(uniqueFriendName + "랑 놀다.");
	}
	
}