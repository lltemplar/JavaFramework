package test;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport
{
	private int num1;
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	private int getSum(){
		return this.num1 + this.num2;
	}
	
	public String execute() throws Exception {
		if(getSum() >= 0){
			return "positive";
		}
		else {
			return "negative";
		}
	}
}
