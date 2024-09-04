import java.util.HashSet;
import java.util.Set;

public class Solution {
    private int highestX = 0;
    private int highestY = 0;
    private char direction = 'n';
    private int x = 0;
    private int y = 0;

    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for (int command : commands) {
            if (command < 0) {
                settingDirection(command);
            } else {
                for (int i = 0; i < command; i++) {
                    int newX = x, newY = y;
                    switch (direction) {
                        case 'n':
                            newY++;
                            break;
                        case 'e':
                            newX++;
                            break;
                        case 's':
                            newY--;
                            break;
                        case 'w':
                            newX--;
                            break;
                    }

                    // Check if the new position is an obstacle
                    if (obstacleSet.contains(newX + "," + newY)) {
                        break; // Stop moving if there's an obstacle
                    }

                    // Update position
                    x = newX;
                    y = newY;
                }
                compare(x, y);
            }
        }
        return highestX * highestX + highestY * highestY;
    }

    private void settingDirection(int turn) {
        if (turn == -1) {
            switch (direction) {
                case 'n':
                    direction = 'e';
                    break;
                case 'e':
                    direction = 's';
                    break;
                case 's':
                    direction = 'w';
                    break;
                case 'w':
                    direction = 'n';
                    break;
            }
        } else if (turn == -2) {
            switch (direction) {
                case 'n':
                    direction = 'w';
                    break;
                case 'w':
                    direction = 's';
                    break;
                case 's':
                    direction = 'e';
                    break;
                case 'e':
                    direction = 'n';
                    break;
            }
        }
    }

    private void compare(int x, int y) {
        if (x * x + y * y > highestX * highestX + highestY * highestY) {
            highestX = x;
            highestY = y;
        }
    }

   
}
