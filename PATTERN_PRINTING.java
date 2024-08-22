import java.util.Scanner;
public class PATTERN_PRINTING {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/ coulmns ==> ");
        int row = sc.nextInt();
        sc.close();
        
        System.out.println("--------------< Code - 1 >-----------------");
        // code - 1
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 2 >-----------------");
        // code - 2
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 3 >-----------------");
        // code - 3
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 4 >-----------------");
        // code - 4
        for (int i = 0; i < row; i++) {
            for (int j = row-2; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("--------------< Code - 5 >-----------------");
        // code - 5
        for (int i = 0; i < row ; i++) {
            for(int k = 0 ; k < i;k++){
                System.out.print("  ");
            }
            for (int j = row ; j > i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 6 >-----------------");
        // code - 6
        for(int i =0 ;i< row ;i ++){
            for(int k = 0;k< i*2 ; k++){
                System.out.print("  ");
            }
            for (int j = 0; j < row - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 7 >-----------------");
        // code - 7
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == row - 1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 8 >-----------------");
        // code - 8
        if (row % 2 ==0) {
            row += 1;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j || i + j == row - 1 )   {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("--------------< Code - 9 >-----------------");
        // code - 9 
        // note -> coulmn = 2 * row
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j <= row - i - 2; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int m = 0; m < i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 10 >-----------------");
        // code - 10
        for (int i = 0; i < row ; i++) {
            for(int k =0 ;k<i ;k++){
                System.out.print("  ");
            }
            for(int j =0 ;j < row - i; j++){
                System.out.print("* ");
            }
            for( int m = row - 1 ; m > i ; m--){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 11 >-----------------");
        // code - 11
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row -1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i+1; j++) {
                if (j% 2 == 0) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 0; j < i; j++) {
                if ((i+j)% 2 != 0) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } 
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 12 >-----------------");
        // code - 12
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row -1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i+1; j++) {
                if (j% 2 == 0) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
                }
            }
            for (int j = 0; j < i; j++) {
                if ((i+j)% 2 != 0) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("! ");
                } 
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 13 >-----------------");
        // code - 13
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < row - i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 14 >-----------------");
        // code - 14
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k< row - i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 15 >-----------------");
        // code - 15
        // upper half
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < row - i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for (int i = 1; i < row ; i++) {
            for (int j = 0; j < ( row - i - 1) * 2 ; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 16 >-----------------");
        // code - 16
        // upper half
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < row - i - 1 ; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < row - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for (int i = 0; i < row - 1 ; i++) {
            for (int j = 0; j <= i  ; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 17 >-----------------");
        // code - 17
        // upper half
        for (int i = 0; i < row / 2 ; i++) {
            for (int j = 0; j < row / 2 - i ; j++) {
                System.out.print("* ");
            }
            for (int m = 0; m < 2 * i + 1; m++) {
                System.out.print("  ");
            }
            for (int k = 0; k < row / 2 - i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // lower half
        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                System.out.print("* ");
            }
            if (row%2 == 0) {
                for (int m = 0; m <= row - 2 * ( i + 1 ); m++) {
                    System.out.print("  ");
                }
            }
            else{
                for (int m = 0; m < row - 2 * ( i + 1 ); m++) {
                    System.out.print("  ");
            }
            }
            for (int k = 0; k < i + 1 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 18 >-----------------");
        // code - 18
        // upper half
        for (int i = 0; i < row / 2 + 1 ; i++) {
            for (int j = 0; j < row/2 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < row / 2 - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < row/2 - i - 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 19 >-----------------");
        // code - 19
        if (row % 2 == 0) { // if number of rows is even then turn into odd
            row +=1;
        }
        for (int i = 0; i < row ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < row /2; i++) {
            for (int j = (row / 2) -1; j > i - 1; j--) {
                System.out.print("* ");
            }
            for (int j = 0 ; j < 2*i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = (row / 2) - 1; j > i-1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < row/2 -1; i++) {
            for (int j = 0; j < (i+1)*2 - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < row - 4 - 2*i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i+1)*2 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < row ; i++) {
            System.out.print("* ");
        }

        System.out.println("--------------< Code - 20 >-----------------");
        // code - 20 
        if (row % 2 == 0) {
            row += 1;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= row / 2; j++) {
                if (i == row/ 2  && j == row - 1 || (i+j == row/2 || i - j  == row / 2)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= row / 2; j++) {
                if ( j == i || (i+j) == row -1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        System.out.println("--------------< Code - 21 >-----------------");
        // code - 21
        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < 2*row - 1 - (i+1)*2; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2*row -1; i++) {
            System.out.print("* ");
        }

        System.out.println("\n--------------< Code - 22 >-----------------");
        // code - 22
        for (int i = 0; i < 2*row -1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < row ; i++) {
            for (int j = row - 2; j > i - 1; j--) {
                System.out.print("* ");
            }
            for (int j = 0 ; j < 2*i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = row - 2; j > i-1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 23 >-----------------");
        // code - 23
        int a = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - 1 -i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(a+" ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 24 >-----------------");
        // code - 24
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - 1 -i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(a+" ");
            }
            System.out.println();
            a ++ ;
        }

        System.out.println("--------------< Code - 25 >-----------------");
        // code - 25
        a = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - 1 -i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                a ++ ;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(a+" ");
                a ++ ;
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 26 >-----------------");
        // code - 26
        for (int i = 0; i < row; i++) {
            a = 1;
            for (int j = 0; j < row - 1 -i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                a ++ ;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 27 >-----------------");
        // code - 27
        for (int i = 0; i < row; i++) {
            a = 1;
            for (int j = 0; j < row - 1 -i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                a ++ ;
            }
            a--;
            for (int j = 0; j < i; j++) {
                a-- ;
                System.out.print(a+" ");
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 28 >-----------------");
        // code - 28
        a = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - 1 -i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                a ++ ;
            }
            a -= 2;
            for (int j = 0; j < i; j++) {
                System.out.print(a+" ");
                a--;
            }
            a+=2;
            System.out.println();
        }
        
        System.out.println("--------------< Code - 29 >-----------------");
        // code - 29      
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 1; j++) {
                    System.out.print((i+1)+" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(0+" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print((i+1)+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    
        System.out.println("--------------< Code - 30 >-----------------");
        // code - 30
        for (int i = 0; i < row; i++) {
            a = row;
            for (int j = 0; j < row; j++) {
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 31 >-----------------");
        // code - 31
        for (int i = 0; i < row; i++) {
            a = row;
            for (int j = 0; j < row; j++) {
                if (i+j == row - 1) {
                    System.out.print("* ");
                    a--;
                }
                else{
                    System.out.print(a+" ");
                    a--;
                }
            }
            System.out.println();
        }

        System.out.println("--------------< Code - 32 >-----------------");
        // code - 32
        // upper half
        a = 2;
        System.out.println(1+" ");
        for (int i = 1; i < row; i++) {
            for (int j = 0; j <= i*2  ; j++) {
                if (j % 2 == 0) {
                    System.out.print(a+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            a++;
            System.out.println();
        }
        // lower half
        a = row - 1;
        for (int i = row - 1; i > 0; i--) {
            for (int j = 0; j < 2*i - 1 ; j++) {
                if (j % 2 == 0) {
                    System.out.print(a+" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            a--;
            System.out.println();
        }

        System.out.println("--------------< Code - 33 >-----------------");
        // code - 33
        for (int i = 0; i < row; i++) {
            a = 0;
            for (int j = 0; j < row - i; j++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            for (int j = 0; j < 1; j++) {
                System.out.print(0+" ");
            }
            a = row-1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
        
        System.out.println("--------------< THE END >-----------------");
    }
}

// VISHAL ( E - 75 )