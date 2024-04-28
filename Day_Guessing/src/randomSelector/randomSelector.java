package randomSelector;
import java.util.Random;
import java.util.Vector;


// Function: Random integer generator
// Create by Quanhui Yu
// Date: 04/28/2024



public class randomSelector {
	//The class pass any vector of the events: title OR date OR day
	//and generate the random integer based on the size of the vector
	public int random(Vector<String> vector) {
        Random rand = new Random();
		int selector = rand.nextInt(vector.size());
		return selector;
	}
	
	//define the answer where Monday is = 1, Tuesday = 2 ... Sunday = 7
	public int score(Vector<String> vector,int selector) {
		int answer;
		if (vector.get(selector)== "Monday") {
			answer = 1;
		}
		else if (vector.get(selector)=="Tuesday") {
			answer = 2;
		}
		else if (vector.get(selector)=="Wednesday") {
			answer = 3;
		}
		else if (vector.get(selector)=="Thursday") {
			answer = 4;
		}
		else if (vector.get(selector)=="Friday") {
			answer = 5;
		}
		else if (vector.get(selector)=="Saturday") {
			answer = 6;
		}
		
		else {
			answer = 7;
		}
		return answer;
	}
}
