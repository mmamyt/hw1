package forGitHub;

public class FirstExercise {
    public static void main(String[] args) {

        int [] one = {12, 43, 2, 435, 2132, 3, 65};
        int max = one[0];
        for(int i = 0; i < one.length; i++) {
            if(max < one[i]) {
                max = one[i];
            }
        }
        System.out.println(max + " is the maximum number in the given array!");


    }
}
