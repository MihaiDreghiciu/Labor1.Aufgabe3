import java.util.Arrays;

public class Main {

    static void main() {
        int[] a = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(BigNumberArray.add(a, b)));
        int[] c = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] d = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(BigNumberArray.subtract(c, d)));
        int[] e = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(BigNumberArray.multiply(e, 2)));
        System.out.println(Arrays.toString(BigNumberArray.divide(e, 2)));
    }

}
