interface Sort {
    void sort(int[] arr);
}

class BubbleSort implements Sort {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr)
            System.out.print(i + " ");
    }
}

class Interface {
    public static void main(String[] args) {
        Sort s = new BubbleSort();
        int arr[] = {5, 2, 9, 1};
        s.sort(arr);
    }
}