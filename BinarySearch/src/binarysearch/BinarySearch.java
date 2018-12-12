package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int array1[]={-1,1,2,3,4,4,5,6,7,8,9,10,11,23,24,25,26,27,28,29,30,33,36,39,40,100,250};
        int search = 7;
        
        System.out.println("Найдено "+search+" в ["+BinarySearch(array1, search)+"]");
    }
 
    static int BinarySearch(int array[], int searchValue){
        
        int Start = 0;
        int Finish = array.length;
        int location;
        
        for(int i = Start; i<=array.length;i++){
            location=(Start+Finish)/2;
            
            if(array[location]==searchValue)
                return location;     
            else if(array[location]<searchValue)
                Start=location;            
            else if(array[location]>searchValue)
                Finish=location;
            else
                return -1;
        }        
        return -1;
    }
}
