package data_models;

public class StudentModel {

    public enum Branch {
        IT, CS, ETC, CIVIL, MECH, NOT_DEFINED
    }

    public enum Division {
        A, B, C, D, NOT_DEFINED
    }

    public enum Gender {
        MALE, FEMALE, TRANS, NOT_DEFINED
    }

    public enum YearOfStudy {
        FE, SE, TE, BE, NOT_DEFINED
    }

    private String rollno;
    private String fullname;
    private String dateofbirth;
    private Integer age;
    private Gender gender;
    private Branch branch;
    private YearOfStudy yearOfStudy;
    private Division division;
    private Double CGPA;
    private String phone;
    private String email;

    public String getFullName() {
        return this.fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public String getRollNo() {
        return this.rollno;
    }

    public void setRollNo(String rollno) {
        this.rollno = rollno;
    }

    public String getDob() {
        return this.dateofbirth;
    }

    public void setDob(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Branch getBranch() {
        return this.branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public YearOfStudy getYearOfStudy() {
        return this.yearOfStudy;
    }

    public void setYearOfStudy(YearOfStudy yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Division getDivision() {
        return this.division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Double getCGPA() {
        return this.CGPA;
    }

    public void setCGPA(Double CGPA) {
        this.CGPA = CGPA;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentModel() {
        this.rollno = "NA";
        this.fullname = "NA";
        this.dateofbirth = "NA";
        this.age = 0;
        this.gender = Gender.NOT_DEFINED;
        this.branch = Branch.NOT_DEFINED;
        this.yearOfStudy = YearOfStudy.NOT_DEFINED;
        this.division = Division.NOT_DEFINED;
        this.CGPA = 0.0;
        this.phone = "0000000000";
        this.email = "na@na.com";
    }

    @Override
    public String toString() {
        return "Roll No: " + this.rollno + "\n" + "Full Name: " + this.fullname + "\n" + "Date of Birth: "
                + this.dateofbirth + "\n" + "Gender: " + this.gender + "\n" + "Age: " + this.age + "\n" + "Branch: "
                + this.branch + "\n" + "Year of Study: " + this.yearOfStudy + "\n" + "Division: " + this.division + "\n"
                + "CGPA: " + this.CGPA + "\n" + "Phone: " + this.phone + "\n" + "Email: " + this.email;
    }

}
