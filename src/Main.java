public class Main {
    public static void main(String[] args) {
        //1 task
        int[] ar = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        double[] arr = {1.57, 7.654, 9.986};
        int[] user = {1, 2, 3, 4, 5};
        //2task
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i != ar.length -1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length -1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < user.length; i++){
            System.out.print(user[i]);
            if (i != user.length -1) {
                System.out.print(",");
            }
        }
        // 3 task
        System.out.println();
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = user.length - 1; i >= 0; i--) {
            System.out.print(user[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        // 4 task
        System.out.println();
        for (int i = 0; i < ar.length; i++)
            if (ar[i] % 2 != 0) {
                ar[i] = ar[i] + 1;
                System.out.print(ar[i] + " ");
            }
    }
}