package com.services.isp;

public interface SocialMedia {

	// I -> Interface Segregation Principle-> as few applications are not supported all the methods of social media, 
	//so we have divided the functionalities into different interfaces and attaching them to our applications
	public void chartWithFriend();
	
	public void sharePhotosVideos();
}
