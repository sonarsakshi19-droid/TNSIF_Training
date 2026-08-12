package org.tnsif.acc.c2tc.multipleinterface;

class SmartPhone implements Camera, MusicPlayer {

@Override
public void playMusic() {
	System.out.println("Playing music on the smartphone");
	// TODO Auto-generated method stub

}

@Override
public void takePhoto() {
	System.out.println("Taking phone using the smartphone");
	// TODO Auto-generated method stub
	
}
}

public class MultipleInterfaceDemo {

public static void main(String[] args) {
	SmartPhone phone = new SmartPhone();
	phone.playMusic();
	phone.takePhoto();

}
// TODO Auto-generated method stub

}
