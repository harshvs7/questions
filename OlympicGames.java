/*In Olympics, the countries are ranked by the total number of medals won.
You are given six integers G1, S1, B1, and G2, S2, B2, the number of gold,
silver and bronze medals won by two different countries respectively.
Determine which country is ranked better on the leaderboard. It is guaranteed that
there will not be a tie between the two countries.*/

import java.util.Scanner;

public class OlympicGames{


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        int T=scanner.nextInt();

        int count=-0;
        while(count<T){
            int G1=scanner.nextInt();
            int S1=scanner.nextInt();
            int B1=scanner.nextInt();
            int G2=scanner.nextInt();
            int S2=scanner.nextInt();
            int B2=scanner.nextInt();

            if(G1+S1+B1>G2+S2+B2)
                System.out.println("1");
            else
                System.out.println("2");

            count++;
        }
    }


}
