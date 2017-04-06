package codingame;

public class NexNode {

	/*
	 
	 For a table of character, a point presented by '0' or '.'  and it has coordinate(x,y)
	 A point is a node if it's presented by '0'
	  you must find each (x1,y1) coordinates containing a node,
	  and display the (x2,y2) coordinates of the next node to the right, 
	  and the (x3,y3) coordinates of the next node to the bottom within the grid.
	  
	  If a neighbor does not exist, you must output the coordinates -1 -1 instead of (x2,y2) 
	  and/or (x3,y3).
	
	Output :
	  One line per node. Six integers on each line:   x1  y1  x2  y2  x3  y3
	  
	  
	  For example :
	    a,   [ 0 . 0 . 0
	           . 0 0 0 .]
	        => result :  0  0   2  0 -1  -1
						2  0   4   0  2  1
						4  0   -1  -1 -1  -1
						1  1   2   1 -1  -1
						2  1   3   1 -1  -1
						3  1   -1 -1 -1  -1

	*/
	
	public static void main(String[] args) {
			
		//Test 
		char[][] table = new char[][]{
				  { '0', '.', '0' ,'.', '0' },
				  { '.', '0', '0', '0', '.'}
				};
		
		printNeiboughNode(table, 2, 5);
		
	}
	public static void printNeiboughNode(char[][] table, int height, int width){
        for (int i = 0; i < height  ; i++) {
            for (int j = 0; j < width ; j++) {   
              if(table[i][j] == '0') {
                  String sright = getNodeRight(table, j, i, width, height);
                  String sbottom = getNodeBottom(table, j, i, width, height);
                  System.out.println( j + "  " + i + "  " + sright + sbottom);
              } 
            }
         }
	}
	

    private static String getNodeRight(char[][] table , int j, int i, int width, int height) {
        if (j +1 == width){
           return " -1 -1";
        }
        if (table[i][j+1] == '0') {
            return " " +(j+1) + "  " + i ;
        } 
        return getNodeRight( table , j+1, i,  width,  height);
    }
    
    private static String getNodeBottom(char[][] table , int j, int i, int width, int height) {
        if ((i +1) == height){
           return " -1  -1";
        }
        if (table[i+1][j] == '0') {
            return " " +(j) + "  " + (i+1);
        } 
        return getNodeBottom( table , j, i+1,  width,  height);
    }
    
}
