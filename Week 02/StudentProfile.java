public class StudentProfile {
 private String name;
 private String studentId;
 private String course;
 private String year;
 private int age;

 public StudentProfile(String name, String studentId, String course, String year, int age) {
  this.name = name;
  this.studentId = studentId;
  this.course = course;
  this.year = year;
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getStudentId() {
  return studentId;
 }

 public void setStudentId(String studentId) {
  this.studentId = studentId;
 }

 public String getCourse() {
  return course;
 }

 public void setCourse(String course) {
  this.course = course;
 }

 public String getYear() {
  return year;
 }

 public void setYear(String year) {
  this.year = year;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public void displayProfile() {
  System.out.println("Student Profile");
  System.out.println("Name: " + name);
  System.out.println("Student ID: " + studentId);
  System.out.println("Course: " + course);
  System.out.println("Year: " + year);
  System.out.println("Age: " + age);
 }

 public static void main(String[] args) {
  StudentProfile student = new StudentProfile(
    " OKORIE VICTOR ",
    " 25/18417 ",
    " Software Engineering ",
    "Second Year",
    17);

  student.displayProfile();
 }
}
