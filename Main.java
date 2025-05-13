import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            // Store tic tac toe board in a 2 dimensinal array 
            char [][] board = {{'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+'},
                    {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                    {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+' },
                    {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                    {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+'},
                    {'|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' ', ' ', '|'},
                    {'+', '-', '-', '-', '+', '-', '-', '-', '+', '-', '-', '-', '+'}};
           Scanner input = new Scanner(System.in);
        
        char currentPlayer = 'X';    

        while (true) { 
            printBoard(board);

            insertMove(input, board, currentPlayer);

            if (checkWinner(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            
            if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a tie!");
                break;
            }

            
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        input.close();
    }

   public static void insertMove(Scanner sc, char[][] board, char player) {
    while (true) {
        System.out.print("Player " + player + ", enter move (row col): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        if (r < 0 || r > 2 || c < 0 || c > 2) {
            System.out.println("Invalid coordinates; try 0, 1, or 2.");
            continue;
        }

   
        int aRow = r * 2 + 1;
        int aCol = c * 4 + 2;

    
        if (board[aRow][aCol] != ' ') {
            System.out.println("That spot's already taken; try again.");
            continue;
        }

     
        board[aRow][aCol] = player;
        return;
    }
}

    public static void printBoard(char[][] board) {
        System.out.println();
        for (char [] row : board) {
            for (char c : row){
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

public static boolean checkWinner(char[][] b, char p) {
    
    if (b[1][2]==p && b[1][6]==p && b[1][10]==p) return true;
    if (b[3][2]==p && b[3][6]==p && b[3][10]==p) return true;
    if (b[5][2]==p && b[5][6]==p && b[5][10]==p) return true;
  
    if (b[1][2]==p && b[3][2]==p && b[5][2]==p) return true;
    if (b[1][6]==p && b[3][6]==p && b[5][6]==p) return true;
    if (b[1][10]==p && b[3][10]==p && b[5][10]==p) return true;

    if (b[1][2]==p && b[3][6]==p && b[5][10]==p) return true;
    if (b[1][10]==p && b[3][6]==p && b[5][2]==p) return true;
    return false;
}


public static boolean isBoardFull(char[][] b) {
    for (int rr = 1; rr <= 5; rr += 2) {
        for (int cc = 2; cc <= 10; cc += 4) {
            if (b[rr][cc] == ' ') {
                return false;
            }
        }
    }
    return true;
}
}


