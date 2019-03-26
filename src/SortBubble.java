public class SortBubble {
    public static void main(String[] args) {
        int[] ints = bubbleSort(new int[]{4, 2, 1, 5, 2, 9, 8, 5, 3});

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);

        }
    }


        static int[] bubbleSort ( int[] parametr){
            int n = parametr.length;

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n - i; j++) {
                    if (parametr[j-1] < parametr[j]) {
                        int result = parametr[j-1];
                        parametr[j-1] = parametr[j];
                        parametr[j] = result;
                    }
                }
            }

            return parametr;


        }
    }
