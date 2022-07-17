public class Demo07 {

    //可以AC,但是题目不让用long整型
    public static int reverse(int x) {
        if (x > -10 && x < 10) {
            return x;
        }
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }
        int backUp = Math.abs(x);
        StringBuffer buffer = new StringBuffer();
        while (backUp > 0) {
            int last = backUp % 10;
            buffer.append(last);
            backUp = backUp / 10;
        }
        long result = Long.parseLong(buffer.toString());
        if ((x > 0 && result > Integer.MAX_VALUE) || (x < 0 && -result < Integer.MIN_VALUE)) {
            return 0;
        }
        int end = (int)result;
        if (x < 0) {
            return -end;
        } else {
            return end;
        }
    }

    public int reverse2 (int x) {
        int result = 0;
        int tmp = 0;
        while (x != 0) {
            int last = x % 10;
            result = tmp * 10 + last;
            if (result / 10 != tmp) {
                return 0;
            }
            tmp = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = -2147483648;
        int result = reverse(x);
        System.out.println(result);
    }
}
