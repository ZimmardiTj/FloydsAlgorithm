
package floydsalgorithm;


public class FloydsAlgorithm {

   
    public static void main(String[] args) {
        int[][] adjacency = { { 0,10,5,4,0 } ,
                              { 10,0,3,0,1 },
                              { 5 ,3,0,0,0  },
                              { 4 ,0,0,0,2  },
                              { 0 ,1,0,2,0  }};
        
        int[][] result = floyd(adjacency,5);
         for(int row = 0; row <= 5 - 1; row++)
        {
            for(int col = 0; col <= 5-1; col++)
            {
                        System.out.print(result[row][col] + " ");

            }
            System.out.println();
            
        }
        }
    
    public static int[][] floyd(int[][] ad, int size){
    
        int[][] aCopy = new int[size][size];
        for(int row = 0; row <= size - 1; row++)
        {
            for(int col = 0; col <= size-1; col++)
            {
                if(ad[row][col] == 0){
                    aCopy[row][col] = 9;
                }
                else{
                    aCopy[row][col] = ad[row][col];
                }
            }
        }
        for(int b = 0; b < size ;b++){
            for(int a = 0; a < size ;a++){
                for(int c = 0; c < size ;c++){
                    if(aCopy[a][c] > (aCopy[a][b] + aCopy[b][c]))
                        aCopy[a][c] = aCopy[a][b] + aCopy[b][c];
                        
                }
            }
        }
        return aCopy;
    }
    
    }
    

