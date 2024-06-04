package com.mycompany.sortingbenchmark;


public class SortingBenchmark {
    
    //"быстрая" сортировка
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr,low,high);
            
            quickSort(arr,low,(pi-1));
            quickSort(arr,(pi+1),high);
        }
    }
    
    //определяет опорный элемент и переставляет элементы в зависимости от
    //их отношений с опорным элементом влево или вправо
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low -1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
    
    //сортировка "пузырьком"
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Метод для генерации случайного массива заданного размера
    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        // Генерация небольшого массива
        int[] smallArray = generateArray(100);
        
        // Генерация крупного массива
        int[] largeArray = generateArray(10000);
        
        // Замер времени выполнения сортировки пузырьком для небольшого массива
        long startTime = System.currentTimeMillis();
        bubbleSort(smallArray);
        long endTime = System.currentTimeMillis();
        long smallArrayBubbleSortTime = endTime - startTime;

        // Замер времени выполнения сортировки пузырьком для крупного массива
        startTime = System.currentTimeMillis();
        bubbleSort(largeArray);
        endTime = System.currentTimeMillis();
        long largeArrayBubbleSortTime = endTime - startTime;

        System.out.println("Bubble Sort:");
        System.out.println("Small array sorting time: " + smallArrayBubbleSortTime + " ms");
        System.out.println("Large array sorting time: " + largeArrayBubbleSortTime + " ms");

        // Замер времени выполнения "быстрой" сортировки для небольшого массива
        startTime = System.currentTimeMillis();
        quickSort(smallArray,0,99);
        endTime = System.currentTimeMillis();
        long smallArrayQuickSortTime = endTime - startTime;

        // Замер времени выполнения "быстрой" сортировки для крупного массива
        startTime = System.currentTimeMillis();
        quickSort(largeArray,0,9999);
        endTime = System.currentTimeMillis();
        long largeArrayQuickSortTime = endTime - startTime;

        System.out.println("Quick Sort:");
        System.out.println("Small array sorting time: " + smallArrayQuickSortTime + " ms");
        System.out.println("Large array sorting time: " + largeArrayQuickSortTime + " ms");

    }
    
    
}
