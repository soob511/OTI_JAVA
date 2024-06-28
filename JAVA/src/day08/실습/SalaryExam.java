package day08.실습;

class SalaryExpr{
	int bonus;
	SalaryExpr(){
		bonus = 0;
	}
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	int getSalary(int grade){
		if(grade==1) {
			return bonus+100;
		}else if(grade==2) {
			return bonus+90;
		}else if(grade==3) {
			return bonus+80;
		}else {
			return bonus+70;
		}
	
	}
}
public class SalaryExam {
	public static void main(String[] args) {
		int month = (int)(Math.random()*12+1);
		int grade = (int)(Math.random()*4+1);
		if(month%2==0) {
			SalaryExpr s =new SalaryExpr(100);
			System.out.println(month+"월 "+grade+"등급의 월급은 "+s.getSalary(grade)+"입니다.");
		}else {
			SalaryExpr s =new SalaryExpr();
			System.out.println(month+"월 "+grade+"등급의 월급은 "+s.getSalary(grade)+"입니다.");
		}
	}

}
