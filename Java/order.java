public class order {
    public static void main(String[] args) {
        int[] a = {13, 11, 7, 9, 5, 3, 1};
        int max = 0, temp, tempid;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                temp = a[i];
                tempid = a[i + 1];
                a[i] = tempid;
                a[i + 1] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ||  ");
        }
    }
}
