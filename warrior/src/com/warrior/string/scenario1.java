package com.warrior.string;

public class scenario1 {
public static void main(String[] args) {
String s=new String(" R am ");
String s1="vaibhav";
String s2=s.trim();
String s3= s.intern();




System.out.println(s==s2); 
System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s==s3);
System.out.println(s1.equals(s3));
System.out.println(s1==s3);
System.out.println(s.equals(s3));


}
}
