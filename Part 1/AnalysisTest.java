

import java.util.ArrayList;
import java.util.Random;

public class AnalysisTest {

	ArrayList<PointCP5> d5Array = new ArrayList<PointCP5>();

	int arraySize = 10000000;

	public AnalysisTest() {
		for (int i = 0; i < arraySize; i++) {
			Random r = new Random();

			if (r.nextInt() % 2 == 0) {
				d5Array.add(new PointCP2(r.nextDouble() * 60, r.nextDouble() * 60));
			} else {
				d5Array.add(new PointCP3(r.nextDouble() * 60, r.nextDouble() * 60));
			}
		}
	}

	public static void main(String[] args) {
		AnalysisTest analysis = new AnalysisTest();

		PointCP5 dummy5 = new PointCP2(3, 3);
		
		double start = System.currentTimeMillis();
		
		
		double opTime  = 0;
		
		for (PointCP5 p : analysis.d5Array) {
			double opStart = System.currentTimeMillis();
			p.getX();
			p.getY();
			p.getRho();
			p.getTheta();
			p.getDistance(dummy5);
			p.rotatePoint(90);
			p.toString();
			
			
			opTime += (System.currentTimeMillis() - opStart) / 1000;
		}

		System.out.println("Elapsed time: " + (System.currentTimeMillis() - start) / 1000);
		System.out.println("Time for all methods of PointCP5: " + opTime / 10000000);
		
	
	}
}
