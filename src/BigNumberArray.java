public class BigNumberArray {

    public static int[] add(int[] a, int[] b) {
        int n = a.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;
    }

    public static int[] subtract(int[] a, int[] b) {
        int n = a.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }

}
