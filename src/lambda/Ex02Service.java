package lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyFunc02{
	int tot(int kor, int eng, int mat);
}

@FunctionalInterface
interface MyFunc02_2{
	double avg(int kor, int eng, int mat);
}

@FunctionalInterface
interface MyFunc02_3{
	char grade(double sungjuk);
}

public class Ex02Service {
	public void sungjuk(Ex02VO vo) {
	
		MyFunc02 tot = (kor, eng, mat) -> kor + eng + mat;
		MyFunc02_2 avg = (kor, eng, mat) -> (kor + eng + mat)/3.0;
		MyFunc02_3 grade = (sungjuk) -> {
			if(sungjuk >= 90) return 'A';
			else if(sungjuk >= 80) return 'B';
			else if(sungjuk >= 70) return 'C';
			else if(sungjuk >= 60) return 'D';
			else return 'F';
		};
		vo.setTot(tot.tot(vo.getKor(), vo.getEng(), vo.getMat()));
		vo.setAvg(avg.avg(vo.getKor(), vo.getEng(), vo.getMat()));
		vo.setGrade(grade.grade(vo.getAvg()));
	}

	public void sungjukTotal(List<Ex02VO> vos) {
		
		Ex02VO vo = new Ex02VO();
		
		System.out.println("\t\t\t ** 성  적  표  ** \t\t\t");
		System.out.println("========================================================");
		System.out.println("성명\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<vos.size(); i++) {
			vo = vos.get(i);
			System.out.println(vo.getName() + "\t" + vo.getKor() + "\t" + vo.getEng() + "\t" + vo.getMat() + "\t" + vo.getTot() + "\t" + vo.getAvg() + "\t" + vo.getGrade());
		}
		System.out.println("========================================================");
	}
}	