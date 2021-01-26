package medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode Medium
 * 
 * Id : 900 RLE Iterator
 * 
 * Time Complexity : O(n)
 * 
 * Space Complexity : O(n)
 * 
 * @author Kundan
 *
 */
class Entity{
    private int frequency;
    private int value;
    
    Entity(){
        
    }
    
    Entity( int frequency, int value ){
        super();
        this.frequency = frequency;
        this.value = value;
    }
    
    int getFrequency(){
        return this.frequency;
    }
    
    int getValue(){
        return this.value;
    }
    
    void setFrequency( int frequency ){
        this.frequency = frequency;
            
    }
}
    

public class RLEIterator {
    
    Queue<Entity> queue = null;
    public RLEIterator(int[] A) {
        queue = new LinkedList<Entity>();
        for( int i = 0, j = 1; i < A.length - 1; i += 2, j += 2 ){
            if(A[i] != 0){
                Entity entity = new Entity(A[i], A[j]);
                queue.add(entity);    
            }
        }
    }
    
    public int next(int n) {
        if(!queue.isEmpty()){
            
            Entity entity = queue.peek();
            int newFrequency = entity.getFrequency() - n;
            
            
            if((newFrequency < 0)){
                queue.remove();
                return next(Math.abs(newFrequency));
                
            }
            
            if( queue.size() == 1 && (newFrequency < 0) ){
                return -1;
            }
            
            entity.setFrequency( newFrequency > 0 ? newFrequency : 0 ); 

            if(entity.getFrequency() == 0){
                Entity removedEntity = queue.remove();  
                return removedEntity.getValue();
            }
            
             return entity.getValue();
        }
        
        return -1;
    }
}

