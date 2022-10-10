package Object_Oriented_Programming;

public class Student {

    String name;
    int age;
    String address;

public  Student (String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
}
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age = age;
}
public void setAddress(String address){
    this.address = address;
}
public String getName(){
    return name;
}
public int getage(){
    return age;
}
public String getaddress(){
    return address;
}

public static void main(String[] args) {
    Student stud = new Student("Karthikeyan", 24, "No:30,fourth cross street nalleshwar nagar venkatapuram");
    System.out.println(stud.getName());
    System.out.println(stud.getage());
    System.out.println(stud.getaddress());
    stud.setAge(23);
    System.out.println(stud.getage());
}
}
