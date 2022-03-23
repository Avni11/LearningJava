package com.lrn.project;

public class User {
String name;
long num;
User(String x,long y){
	this.name=x;
	this.num=y;
}
public User() {
}
public void chat()
{
	System.out.println(name+"chatting"+num);
}
public void call() {
	System.out.println(name+"calling"+num);
}
}
