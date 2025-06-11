import java.util.Scanner;

public class basic02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
	    int age = sc.nextInt();
	    float hei = sc.nextFloat();
	    sc.nextLine();
	    String name = sc.nextLine();
	    Boolean dev = sc.nextBoolean();
	      
	    System.out.println("당신의 나이는 " + age + "살 입니다.");
	    System.out.println("당신의 키는 " + hei + "cm 입니다.");
	    System.out.println("당신의 이름은 " + name + "입니다.");
	    System.out.println("당신은 개발자입니까?");
		    if (dev == true){
				System.out.println("YES");}
			else 
				System.out.println("NO");
	   
    sc.close();
    }
}