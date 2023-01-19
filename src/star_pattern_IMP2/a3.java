package star_pattern_IMP2;

public class a3 {
public static void main(String[] args) {
	//rows=3;
	//colums=4;
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=4;j++) {
			if(i==1||i==3||j==1||j==4) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
