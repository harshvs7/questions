/*You have prepared four problems. The difficulty levels of the problems are A1,A2,A3,A4 respectively. 
A problem set comprises at least two problems and no two problems in a problem set should have the same difficulty level. 
A problem can belong to at most one problem set. Find the maximum number of problem sets you can create using the four problems.*/

1≤T≤1000 1≤A1,A2,A3,A4≤10
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



