class Parking {
	String inDate; // 입고 날짜
	String inTime; // 입고 시간
	String outDate; // 출고 날짜
	String outTime; // 출고 시간
	int price; // 요금
	boolean isDiscount; // 할인 여부
}

/*
 * 학생
 * 
 * 이름, 생년월일, 주소, 휴대폰 번호, 성별
 * 
 * 본인 정보를 저장하고 출력하기
 */

class Student {
	String name;
	int birthday;
	String address;
	String phoneNumber;
	String gender;

	public Student(String name, int birthday, String address, String phoneNumber,
			String gender) {
		this.name = name;
		this.setBirthday(birthday);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) throws Exception {
		if (phoneNumber.startsWith("010")) {
			throw new Exception("휴대폰 번호는 010으로 시작해야 합니다");
		}

		if (phoneNumber.length() >= 10 && phoneNumber.length() <= 11) {
			throw new Exception("휴대폰 번호를 10~11자리로 입력하기 바랍니다");
		}

		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) throws Exception {
		if (gender != "남자" || gender != "여자") {
			throw new Exception("남자 또는 여자를 입력하세요");
		}

		this.gender = gender;
	}

}

public class ClassEx01Problem {

	public static void main(String[] args) {
		// Student studentLee = new Student("이준성");

	}

}
