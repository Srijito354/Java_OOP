import java.util.*;
import java.util.concurrent.*;

//Multi-threading top-level moves for faster inference.
//We'll use the ExecutorService to evaluate each first move in separate threads.
public class tictactoe {
    public static void main(String[] args) throws Exception {
        Board board = new Board();
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<Future<Integer>> results = new ArrayList<>();
        List<Integer> moves = board.getAvailableMoves();

        for (int move : moves) {
            Board newBoard = board.makeMove(move, 'X');
            Callable<Integer> task = () -> {
                int val = Minimax.minimax(newBoard, false);
                System.out.println("Thread " + Thread.currentThread().getName() +
                        " evaluated move " + move + " → score " + val);
                return val;
            };
            results.add(executor.submit(task));
        }

        int bestVal = Integer.MIN_VALUE;
        int bestMove = -1;

        for (int i = 0; i < results.size(); i++) {
            int val = results.get(i).get();
            if (val > bestVal) {
                bestVal = val;
                bestMove = moves.get(i);
            }
        }

        executor.shutdown();
        System.out.println("Best move: " + bestMove + " (score " + bestVal + ")");
    }
}

// Writing a minimal class to represent the game state.
// i.e creating the board for the game to represent game state.
class Board {
    char[] cells; // 9 cells: 'X', 'O', or ' '
    
    Board() {
        cells = new char[9];
        Arrays.fill(cells, ' ');
    }

    Board(char[] c) {
        cells = Arrays.copyOf(c, 9);
    }

    List<Integer> getAvailableMoves() {
        List<Integer> moves = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if (cells[i] == ' ') moves.add(i);
        }
        return moves;
    }

    Board makeMove(int index, char player) {
        Board newBoard = new Board(cells);
        newBoard.cells[index] = player;
        return newBoard;
    }

    boolean isTerminal() {
        return getWinner() != ' ' || !getAvailableMoves().isEmpty() == false;
    }

    char getWinner() {
        int[][] wins = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
        };
        for (int[] w : wins) {
            if (cells[w[0]] != ' ' && cells[w[0]] == cells[w[1]] && cells[w[1]] == cells[w[2]]) {
                return cells[w[0]];
            }
        }
        return ' ';
    }

    int getScore() {
        char winner = getWinner();
        if (winner == 'X') return 1;
        if (winner == 'O') return -1;
        return 0;
    }
}

// Implementing a sequential minimax.
class Minimax {
    static int minimax(Board board, boolean isMaximizing) {
        if (board.isTerminal()) return board.getScore();

        if (isMaximizing) {
            int best = Integer.MIN_VALUE;
            for (int move : board.getAvailableMoves()) {
                Board newBoard = board.makeMove(move, 'X');
                best = Math.max(best, minimax(newBoard, false));
            }
            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int move : board.getAvailableMoves()) {
                Board newBoard = board.makeMove(move, 'O');
                best = Math.min(best, minimax(newBoard, true));
            }
            return best;
        }
    }
}
