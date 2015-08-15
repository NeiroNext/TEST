import java.io.*;

public class main {

	public static void main(String[] args){
		String str = "Привет Тест!";

		String strRev = "";

		for (int i=str.length()-1; i>=0; i--) {
			strRev += "" + str.charAt(i);
		}


		for (int i=0; i< 3; i++)
			System.out.println(strRev);
	}

}
