import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 и 2:");
        int[] weight = new int [3];
        System.out.print("1)");
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            if (i == weight.length - 1) {
                System.out.print(weight[i] + ".");
                break;
            } else {
                System.out.print(weight[i] + ", ");
            }
        }

        System.out.println();

        float[] weightSecond = {1.57f, 7.654f, 9.986f};
        System.out.print("2)");
        for (int n = 0; n < weightSecond.length; n++) {
            if (n == weightSecond.length - 1) {
                System.out.print(weightSecond[n] + ".");
                break;
            } else {
                System.out.print(weightSecond[n] + ", ");
            }
        }

        System.out.println();

        int[] x = new int[11];
        System.out.print("3)");
        for (int a = 0; a < x.length; a++) {
            x[a] = a * 2;
            if (a == x.length - 1) {
                System.out.print(x[a] + ".");
                break;
            } else {
                System.out.print(x[a] + ", ");
            }
        }

        System.out.println();

        System.out.println("Задание 3:");
        int[] weightBack = new int [3];
        System.out.print("1)");
        for (int b = weightBack.length - 1; b >= 0 && b < weightBack.length; b--) {
            weightBack[b] = b + 1;
            if (b == 0) {
                System.out.print(weightBack[b] + ".");
                break;
            } else {
                System.out.print(weightBack[b] + ", ");
            }
        }

        System.out.println();

        float[] weightSecondBack = {1.57f, 7.654f, 9.986f};
        System.out.print("2)");
        for (int c = weightSecondBack.length - 1;
             c >= 0 && c < weightSecondBack.length; c--) {
            if (c == 0) {
                System.out.print(weightSecondBack[c] + ".");
                break;
            } else {
                System.out.print(weightSecondBack[c] + ", ");
            }
        }

        System.out.println();

        int[] w = new int [11];
        System.out.print("3)");
        for (int y = w.length - 1; y >= 0 && y < w.length; y--) {
            w[y] = y + 1;
            if (y == 0) {
                System.out.print(w[y] + ".");
                break;
            } else {
                System.out.print(w[y] + ", ");
            }
        }

        System.out.println();

        System.out.println("Задание 4:");
        int[] first = {1, 2, 3};
        for (int a = 0; a < first.length; a++) {
            if (first[a] % 2 != 0) {
                first[a] = first[a] + 1;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}