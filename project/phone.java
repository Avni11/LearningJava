package com.lrn.project;

public class phone {
int price,ram;
String brand;
phone(){
	System.out.println("from phone");
}
phone(int p,int r){
	price=p;
	ram=r;
}
public void call()
{
System.out.println("callling...");	
}
public void message(String msg) {
	System.out.println(msg);
}
public void radio() {
	System.out.println("playing radio");
}


}
