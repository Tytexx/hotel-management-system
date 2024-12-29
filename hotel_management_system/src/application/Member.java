package application;

import java.util.ArrayList;

public abstract class Member {
	
	private String name;
	private int age;
	private String phone;
	private static ArrayList <Member> members = Main_System.getMembers();

	
	public Member(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}	
	
	public Member() {
		
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void removeMember(Member member) {
		members.remove(member);
	}
	
	public void updateMember(Member member) {
		members.add(member);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String viewProfile() {
		return "Member [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	

	
	

}
