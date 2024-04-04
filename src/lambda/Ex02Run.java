package lambda;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Ex02Run {
  public static void main(String[] args) {
  	
    Ex02VO vo = null;
    Ex02Service service = new Ex02Service();
    ArrayList<Ex02VO> vo2 = new ArrayList<Ex02VO>();
    Scanner sc = new Scanner(System.in);
    
    while(true) {
      vo = new Ex02VO();
          
      System.out.print("성명을 입력하세요. (종료시 999) ==> ");
      vo.setName(sc.next());
      if(vo.getName().equals("999")) break;
      
      System.out.print("국어 점수를 입력하세요 => ");
      vo.setKor(sc.nextInt());
      System.out.print("영어 점수를 입력하세요 => ");
      vo.setEng(sc.nextInt());
      System.out.print("수학 점수를 입력하세요 => ");
      vo.setMat(sc.nextInt());
          
      service.sungjuk(vo);
      vo2.add(vo);
    }
    service.sungjukTotal(vo2);
    sc.close();
  }
}
