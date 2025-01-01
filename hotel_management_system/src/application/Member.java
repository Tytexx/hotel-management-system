package application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Member implements Serializable {

	private String name;
	private int age;
	private String phone;
	private static ArrayList<Member> members = new ArrayList<Member>();

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
		saveMember(members);
	}

	public static String removeMember(String name, String phone) {
		for (Member member : members) {
			if (member.name.equals(name) && member.phone.equals(phone)) {
				if (member instanceof Customer) {
					members.remove(member);
					saveMember(members);
					return "Member Deleted Successfully";
				}
				return "Member is not a customer";
			}
		}
		return "Member don't exist";
	}

	public static void updateMember(Member member) {
	}

	public static void saveMember(ArrayList<Member> members) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("members.dat"))) {
			out.writeObject(members);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public static void loadMembers() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("members.dat"))) {
			Object obj = in.readObject();
			if (obj instanceof ArrayList<?>) {
				members = (ArrayList<Member>) obj;
			}
		} catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
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
