package Exercise;

import java.sql.Array;

public class ExserciseA {
    public int[] eraseElementFromArray(int[] array,int number){
        int index=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==number){
                index=i;
                for(int j=index;j< array.length-1;j++){
                    changeValueFromArray(array[j],array[j+1]);
                }
            }
        }
        array[array.length-1]=0;
        return array;

    }
    public void changeValueFromArray(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }

    public int[] addElementToArray(int[] array,int index,int value){
        int[] arrayNew=new int[array.length+1];
        for(int i= array.length-1;i>=0;i--){
            if(i<(index-1)){
                arrayNew[i]=array[i];
            }  else if (i>=(index-1)) {
                arrayNew[i+1]=array[i];
            }
        }
        arrayNew[index-1]=value;
        return arrayNew;
    }

    public int[] sumArray(int[] array1,int[] array2){
        int sumLength=array1.length+ array2.length;
        int[] array3=new  int[sumLength];
        for(int i=0;i< array1.length;i++){
            array3[i]=array1[i];
        }
        for (int i=array1.length;i<sumLength;i++){
            array3[i]=array2[i- array1.length];
        }
        return array3;
    }

    public int findMaxFromArray(int[][] array){
        int max=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(max<array[i][j]){
                    max=array[i][j];
                }
            }
        }
        return max;
    }

    public int findMinFromArray(int[][] array){
        int min=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(min>array[i][j]){
                    min=array[i][j];
                }
            }
        }
        return min;
    }

    public int sumNumberFromColumnOfArray(int[][] array,int column){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[column][i];

        }
        return sum;
    }

    public  int sumNumberFromDiagonalLineOfArray(int[][] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum +=array[i][i];
        }
        return sum;

    }

    public  int countCharInString(String string,char c){
        int count=0;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i)==c){
                count++;
            }

        }
        return  count;
    }

}
