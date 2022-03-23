package com.lrn.project;

public class smartphone extends phone {
smartphone(int price,int ram){
super(price,ram);}
double camera;
int no_of_cam;
smartphone(double c,int n){
 camera=c;
 no_of_cam=n;
}


public void play() {
	System.out.println("playing....");
	
}
public void selfie() {
	System.out.println("taking selfie...");
}

}
