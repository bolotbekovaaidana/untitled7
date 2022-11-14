public class Main {
    public static void main(String[] args) {
//321 123 -321 -123 1234 0
    }
    public static void a (int b){
        int[] a={1,2,3,4,5};
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    r = a[i];
                    a[i] = a[j];
                    a[j] = r;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

