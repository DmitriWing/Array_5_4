package myArray;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array_5_4_2 {
// Даны сведения о количестве забитых голов каждого футболиста команды в каждом из
//матчей чемпионата(прошло 5 матчей). Проверить, сколько в команде есть футболистов:
int[][] playersArray = {
        /*0*/{0, 1, 3, 1, 3},
        /*1*/{0, 1, 0, 0, 1},
        /*2*/{0, 0, 0, 2, 0},
        /*3*/{1, 1, 2, 2, 3},
        /*4*/{0, 0, 0, 0, 0},
        /*5*/{0, 0, 0, 0, 0},
        /*6*/{0, 1, 1, 0, 5},
        /*7*/{1, 1, 1, 0, 1},
        /*8*/{2, 2, 2, 2, 2},
        /*9*/{2, 2, 2, 2, 2},
        /*10*/{2, 0, 1, 2, 2}
                            };
    
   // a. забивших хотя бы два гола; 9
    int twoGoals = 0;
    public int twoGoalsPlayers(){
        for (int i = 0; i < playersArray.length; i++) {
            int playerGoals = IntStream.of(playersArray[i]).sum();
            if (playerGoals > 1) {
               twoGoals++;
            }
        }
        return twoGoals;
    }
    
    //b. забивавших голы в каждом матче;
    int everyGame=0;
    
    public int everyGameGoal(){
        int everyGame = 0;
        int target = 0;
        for (int i = 0; i < playersArray.length; i++) {
            boolean found = Arrays.stream(playersArray[i])
                            .boxed()
                            .collect(Collectors.toSet())
                            .contains(target); 
            if (!found) {
                everyGame++;
            }
        }
        
        return everyGame;
    }
    
    // d. лучшего игрока чемпионата
    
     public int[] bestPlayer(){
         int maxGoals = 0;
        // define maximum goals per player
        for (int i = 0; i < playersArray.length; i++) {
            int goalsTotal = IntStream.of(playersArray[i]).sum();
            if (goalsTotal > maxGoals) {
                maxGoals = goalsTotal;
            }
        }
        // define how many players with max goals
        int maxGoalsQty = 0;
        for (int i = 0; i < playersArray.length; i++) {
            int goalsTotal = IntStream.of(playersArray[i]).sum();
            if (goalsTotal == maxGoals) {
                maxGoalsQty++;                
            }
        }
        // create an array with best players positions
        int[] bestPlayers = new int[maxGoalsQty];
        int k = 0;
        for (int i = 0; i < playersArray.length; i++) {
            int goalsTotal = IntStream.of(playersArray[i]).sum();
            if (goalsTotal == maxGoals) {
                bestPlayers[k] = i+1;
                k++;
            }
        }
         
         return bestPlayers;
     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}   // end public class Array_5_4_2
