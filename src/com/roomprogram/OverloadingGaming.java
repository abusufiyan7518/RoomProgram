package com.roomprogram;

// Overloading
class FreeFire {
	String attachments(String scope) {
		return "This is AK47 with " + scope;
	}

	String attachments(String scope, String Ammo) {
		return "This is Sniper with " + scope + Ammo;
	}
}

public class OverloadingGaming {
	public static void main(String[] args) {
		FreeFire gunFire = new FreeFire();
		System.out.println(gunFire.attachments("4x"));
		System.out.println(gunFire.attachments("6x", " and 140 Ammo"));
	}

}
