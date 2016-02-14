import java.util.*;
import java.lang.*;
import java.io.*;

public class mGrid {
	int size;
	int numMine;
	
	int rows;
	int columns;
	int Val;//the default int value is zero 
	int Player;
	
	mSingle[][] mGrid_ = new mSingle[10][10];
	
	mGrid (){
		size = 10;
		numMine = size;
		rows = size;
		columns = size;
		
		// random initialize the position of the mine
		List<Integer> queue = new ArrayList<>();
		for (int i = 1; i <= size*size; i++)
		{
			if (i<=10)queue.add(1);
			else queue.add(0);
		}
		Collections.shuffle(queue);
        
		// initialize the grid
        for(int i=0;i<rows;i++) { 
        	for(int j=0;j<columns;j++) {
        		if (queue.get(i*10+j+1)==1){
        			mGrid_[i][j] = new mSingle(true); 
        		} 
        	    else{
        	    	mGrid_[i][j] = new mSingle(false); 
        	    }
        	}
        }
        
        // add adjacent button information
        for(int i=0;i<rows;i++) { 
        	for(int j=0;j<columns;j++) {
        		if (queue.get(i*10+j+1)==1){
        			// check the adjacent button and assign that information
        		}
        	    }
        	}
        }
}
