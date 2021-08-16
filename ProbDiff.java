import java.util.Arrays;
import java.util.Scanner;

public class ProbDiff {
    public static void main(String[] args) {




                Scanner scanner = new Scanner(System.in);
                int T=scanner.nextInt();
                int[] arr= new int[4];
                while(T>0) {


                    for (int i = 0; i < 4; i++) {
                        arr[i] = scanner.nextInt();

                    }
                    Arrays.sort(arr);
                    if (arr[0] != arr[1] && arr[2] != arr[3] && arr[1] != arr[2]) {
                        System.out.println("2");

                    }
                    else if (arr[0] == arr[1] && arr[3] == arr[2] && arr[1] != arr[2]) {
                        System.out.println("2");

                    }
                    else if ((arr[0] != arr[1] && arr[3] == arr[2] && arr[1] != arr[2]) ||
                            (arr[0] != arr[1] && arr[3] != arr[2] && arr[1] == arr[2]) ||
                            (arr[0] == arr[1] && arr[3] != arr[2] && arr[1]!=arr[2] )) {

                        System.out.println("2");

                    }
                    else if ( (arr[0] != arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) ||
                            (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] != arr[3])

                    ) {
                        System.out.println("1");

                    }
                    else {
                        System.out.println("0");
                    }
                    T--;
                }

    }

}



