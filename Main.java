import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            char [][] board = {{'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+'},
                    {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                    {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
                    {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                    {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+'},
                    {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                    {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+'}};
            printBoard(board);
            Scanner input = new Scanner(System.in);
        System.out.println("Please make your move by entering (1 - 9) ");
           int position = input.nextInt();

        System.out.println(position);

        switch (position) {
            case 1:
                board [0][0] = 'X';
                break;
            case 2:
                board [0][2] = 'X';
                break;
            case 3:
                board [0][4] = 'X';
                break;
            case 4:
                board [2][0] = 'X';
                break;
            case 5:
                board [2][2] = 'X';
                break;
            case 6:
                board [2][4] = 'X';
                break;
            case 7:
                board [4][0] = 'X';
                break;
            case 8:
                board [4][2] = 'X';
                break;
            case 9:
                board [4][4] = 'X';
                break;

        }
        printBoard(board);




    }

    public static void printBoard(char[][] board) {
        for (char [] row : board) {
            for (char c : row){
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }
    }

}



