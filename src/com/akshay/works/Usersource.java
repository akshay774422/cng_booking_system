package com.akshay.works;

public class Usersource
{
	static String mob;
	static String em;
	static int pumpid;
	public static int getPumpid() {
		return pumpid;
	}
	public static void setPumpid(int pumpid) {
		Usersource.pumpid = pumpid;
	}
	public static String getEm() {
		return em;
	}
	public static void setEm(String em) {
		Usersource.em = em;
	}
	static String password;
	public static String getMob() {
		return mob;
	}
	public static void setMob(String mob) {
		Usersource.mob = mob;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Usersource.password = password;
	}
}