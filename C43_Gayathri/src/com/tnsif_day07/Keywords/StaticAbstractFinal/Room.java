package com.tnsif_day07.Keywords.StaticAbstractFinal;
abstract class value{
	void show() {
		System.out.println("Abstract");
	}
}
public class Room extends value{
     void demo() {
    	 System.out.println("Print");
     }

public class Student {
      //abstract int a; - it is not possible to create a variable using abstract
	
	public static void main(String[] args) {
		Room obj=new Room();
		obj.show();
		obj.demo();
	}

	public int getPer() {
		// TODO Auto-generated method stub
		return 0;
	}
	}
}


