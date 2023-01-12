package javapractise;

public class Animal1 {
	void eat(){
		System.out.println("eating...");}  
	public static void main(String args[]){  
	 BabyDog d=new BabyDog(); 
	 d.weep();  
	 d.bark();  
	 d.eat();  
	}
	}
class Dog extends Animal1{  
void bark(){
	System.out.println("barking...");}  
  
}
class BabyDog extends Animal1{  
void weep(){
	System.out.println("weeping...");} 


}  


