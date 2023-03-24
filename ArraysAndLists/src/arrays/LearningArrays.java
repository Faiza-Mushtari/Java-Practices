package arrays;

public class LearningArrays {
    public static void main(String[] args) {
        int[] studentMathScore = new int[6];

        for(int i=0;i<5;i++){
            studentMathScore[i]=i+1; //cannot use i++
        }

        for(int i=0;i<5;i++){
            System.out.println(studentMathScore[i]);
        }
    }
}
