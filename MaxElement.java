public int maxElement(int[] arr) {
    if (arr.length == 0) {
        return 0; // or throw an exception
    }
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}












































