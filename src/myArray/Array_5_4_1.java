package myArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array_5_4_1 {
    int[] numberArray = new int[] {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16};
        // a. количество четных и нечетных чисел; 
        int oddQty=0; 
        int evenQty=0;   
        // b. максимальный/минимальный элемент;
        int maxElem = numberArray[0];
        int minElem = numberArray[0];
        // c. количество максимальных/минимальных элементов;
        int maxQty = 0; 
        int minQty = 0; 
        // d. номер первого/последнего максимального/минимального элемента; 
        int firstMaxPosition;   
        int lastMaxPosition;    
        int firstMinPosition;   
        int lastMinPosition;    
        // e. первый минимальный с первым элементом массива поменять местами, а максимальный элемент с последним элементом массива;
        int replacedArray[];
        // f. среднее арифметическое значений элементов;
        double average;
        // g. вычислить сумму положительных элементов массива после первого нуля (при наличии нулевого элемента);
        int sumPositiveAfterNull;  
        // h. определить второй по величине элемент массива;
        int secondLargestElem;
        // i. определить количество разных элементов массива;
        int uniqueQty = numberArray.length;
        // j. все нули переместить в конец массива; 
        int nullsToEndArray[];
    
    // a. количество четных и нечетных чисел;
    public int[] oddEvenQty(){
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 0) {
                evenQty ++;
            }else{
                oddQty ++;
            }
        }
        int[] result = new int[]{oddQty, evenQty};
        return result;
    }
    
    // b. максимальный/минимальный элемент;
    public int[] maxMinElement(){
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > maxElem ) {
                maxElem = numberArray[i];
            }else if(numberArray[i] < minElem ){
                minElem = numberArray[i];
            }
        }
        int[] result = new int[]{maxElem, minElem};
        return result;
    }
    
    // c. количество максимальных/минимальных элементов;
    public int[] maxMinQty(){
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == maxMinElement()[0]) {
                maxQty ++;
            }else if (numberArray[i] == maxMinElement()[1]){
                minQty ++;
            }
        }
        int[] result = new int[]{maxQty, minQty};
        return result;
    }
    
    // d. номер первого/последнего максимального/минимального элемента; 
    public int[] elementPosition(){
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == maxMinElement()[0]) {
                firstMaxPosition = i+1;
                break;
            }
        for (int j = 0; j < numberArray.length; j++) {
            if (numberArray[j] == maxMinElement()[1]){
                firstMinPosition = j+1;
                break;
            }
        }
        }
        // find last positions
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == maxMinElement()[0]) {
                lastMaxPosition = i+1;
            }else if (numberArray[i] == maxMinElement()[1]){
                lastMinPosition = i+1;
            }
        }
        int[] result = new int[]{firstMaxPosition, lastMaxPosition,firstMinPosition, lastMinPosition};
        return result;
    }
    
    // e. первый минимальный с первым элементом массива поменять местами, а максимальный элемент с последним элементом массива;
    // int[] numberArray = new int[]{66, 45 , -3, 0, 66, 16, -33, 66, 15, -87};
//        https://ru.stackoverflow.com/questions/1231643/java-%D0%9F%D0%BE%D0%BC%D0%B5%D0%BD%D1%8F%D1%82%D1%8C-%D0%BC%D0%B5%D1%81%D1%82%D0%B0%D0%BC%D0%B8-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D1%8B-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0
    public int[] replaceMinMax(){
        int maxElemIndex = 0;
        int minElemIndex = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > maxElem ) {
                maxElem = numberArray[i];
                maxElemIndex = i;
            }else if(numberArray[i] < minElem ){
                minElem = numberArray[i];
                minElemIndex = i;
            }
        }
        int tempMax = numberArray[maxElemIndex];       // 66
        numberArray[maxElemIndex] = numberArray[numberArray.length-1];
        numberArray[numberArray.length-1] = tempMax;
        
        int tempMin = numberArray[minElemIndex];       // 1
        numberArray[minElemIndex] = numberArray[0];
        numberArray[0] = tempMin;
        replacedArray = Arrays.copyOf(numberArray, numberArray.length);
        return replacedArray;
    }
    
    // f. среднее арифметическое значений элементов;
//    double average;
    public double numberArrayayAverage(){
        double sumArray = 0;
        double result;
        for (int i = 0; i < numberArray.length; i++) {
            sumArray += numberArray[i];
        }
        average = sumArray / numberArray.length;
        return average;
    } 
    
    // g. вычислить сумму положительных элементов массива после первого нуля (при наличии нулевого элемента);
//          int sumPositiveAfterNull;
//          {-87, 15, -3, 0, 66, 16, -33, 45, -87, 66}
    public int sumPosAftNull(){
//        int nullPosition = Arrays.asList(numberArray).indexOf(0)+1;
        int nullPosition = IntStream.range(0, numberArray.length)
                    .filter(i -> 0 == numberArray[i])
                    .findFirst()
                    .orElse(-1) + 1;
        int [] cutedNumberArray = Arrays.copyOfRange(numberArray, numberArray.length-(numberArray.length-nullPosition), numberArray.length);
        for (int i = 0; i < cutedNumberArray.length; i++) {
            if (cutedNumberArray[i] > 0) {
                sumPositiveAfterNull += cutedNumberArray[i];
            }
        }
        
        return sumPositiveAfterNull;
    }
    
    // h. определить второй по величине элемент массива;
//        int secondLargestElem;
    public int secondLargestElement(){
        int largest = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > largest) {
                secondLargestElem = largest;
                largest = numberArray[i];
            }
        }
        return secondLargestElem;
    }
    
    // i. определить количество разных элементов массива;
    //    int uniqueQty = numberArray.length; {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16} - 8
    public int uniqueElemsQty(){
        // create an array without bouble values (uniques numbers only)
        Set<Integer> uniqueElements = new HashSet<>(Arrays.stream(numberArray).boxed().collect(Collectors.toList()));
        uniqueQty = uniqueElements.size();
        return uniqueQty;
}
    
    // j. все нули переместить в конец массива; 
    // int nullsToEnd[];
    // {15, 45 , -3, 0, 66, -87, -33, 66, -87, 16}
    public int[] nullsReordered(){
        nullsToEndArray = Arrays.copyOf(numberArray, numberArray.length);
        // `k` сохраняет индекс следующей доступной позиции
        int k = 0;
        // делаем для каждого элемента
        for (int i = 0; i < nullsToEndArray.length; i++){
            // если текущий элемент отличен от нуля, поместить элемент в
            // следующая свободная позиция в массиве
            if (nullsToEndArray[i] != 0) {
                nullsToEndArray[k++] = nullsToEndArray[i];
            }
        }
 
        // перемещаем все 0 в конец массива (оставшиеся индексы)
        for (int i = k; i < nullsToEndArray.length; i++) {
            nullsToEndArray[i] = 0;
        }

        return nullsToEndArray;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}   // ends public class Array_5_4_1
    

