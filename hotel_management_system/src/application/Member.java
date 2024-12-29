package application;

import java.util.ArrayList;

public abstract class Member {

	private String name;
	private int age;
	private String phone;
	private static ArrayList<Member> members = new ArrayList<>();

	public Member(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public Member() {

	}

	public static void addMember(Member member) {
		members.add(member);
	}

	public static String removeMember(String name, String phone) {
		for (Member member : members) {
			if (member.name.equals(name) && member.phone.equals(phone)) {
				if (member instanceof Customer) {
					members.remove(member);
					return "Member Deleted Successfully";
				}
				return "Member is not a customer";
			}
		}
		return "Member don't exist";

	}

	public static void updateMember(Member member) {
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

	public static ArrayList<Member> getMembers() {
		return members;
	}

	public String viewProfile() {
		return "Member [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

}
