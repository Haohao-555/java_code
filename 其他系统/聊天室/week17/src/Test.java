import java.util.ArrayList;
import java.util.Collections;


public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> teams = new ArrayList<Integer>();
		for(int i=1;i<=21;i++){
			teams.add(i);
		}
		//System.out.println(teams);
		Collections.shuffle(teams);
		System.out.println(teams);
	}
}
