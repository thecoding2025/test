package momo.inheritance.instance;

class Parent{
	
	// 객체변수 
    String myName = "모모 엄빠"; 
    
	// 정적변수 
    static String friendName = "홍길동";
    
    // 일반메소드
    void work(){     	
    	System.out.println(myName + "은 열심히 일하다!");
    }
    
    // 정적메소드 
	static void meetFriend() {
		System.out.println(friendName + "랑 놀다");
	}
}