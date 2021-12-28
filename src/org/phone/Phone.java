package org.phone;

public class Phone {
	private void phoneInfo() {
		System.out.println("my phone details");
	}
		private void phoneInfo(String name){
			System.out.println("phone name:"+name);
		}
			 private void phoneInfo(String name,int number){
				System.out.println("the phone name and number is"+number);
			}
			 private void phoneInfo(int number,String name){
				 System.out.println("the same"+name); 
			 }
			 private void phoneInfo(int number,String name,double amount) {
				 System.out.println("the last details"+amount);
			 }
			 public static void main(String[] args) {
				Phone a= new Phone();
				a.phoneInfo();
				a.phoneInfo("oppo");
				a.phoneInfo(733967265, "oppo");
				a.phoneInfo("oppo", 733967265);
				a.phoneInfo(733967265, "oppo", 27000.90);
				
			}
		

	}
	


