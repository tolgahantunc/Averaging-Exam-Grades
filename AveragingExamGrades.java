import java.util.Scanner;

public class AveragingExamGrades {
    private static final int LINE_LIMIT = 1000;

    public static float weightedAverage(float[] grades){
        return (grades[0]*0.2f + grades[1]*0.4f + grades[2]*0.4f);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] grades = new float[3];
        int line_count = 0;

        while (scanner.hasNextFloat() && line_count < LINE_LIMIT){
            for(int i = 0 ; i < grades.length ; i++)
                grades[i]= scanner.nextFloat();

            float weigtedAvg = weightedAverage(grades);

            System.out.println(weigtedAvg);
            line_count++;
        }

        scanner.close();
    }
	
}
