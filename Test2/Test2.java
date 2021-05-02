package Test2;

public class Test2 {
    public static void main(String[] args) {

        /**
         Harry's favourite number is X and Sam's favourite number is Y.

         A non-empty array Arr consisting of N integers is given.
         Harry and Sam are interested in occurrences of their favourite numbers X and Y in array Arr.
         They are looking for the longest leading fragment (prefix) of array Arr in which there is one occurrence of X and Y.
         Formally, they are looking for the longest P such that P<=N and the number of occurrences of X equals the number of occurrences of Y in the array Arr.

         For example, consider:
         X=7 and Y=42 and Arr={6, 42, 11, 7, 1, 42}
         Ans -> 4    (bcz, upto index-4 i.e. {6, 42, 11, 7, 1} ; 7 and 42 are present equal number of times)

         X=6  Y=13  Arr={13, 13, 1, 6}
         Ans -> -1  (bcz, there is no portion of Arr where 6 and 13 are in equal numbers)

         X=100  Y=63  Arr={100, 63, 100, 6, 2}
         And -> 1 (bcz, upto index-1 i.e. {100, 63} ; 100 and 63 are present equal number of times)

         X=10  Y=64  Arr={10, 32, 100, 64, 2, 55, 22}
         And -> 6 (bcz, upto index-6 i.e. {10, 64, 100, 6, 2, 55, 22} ; 10 and 64 are present equal number of times)
         */

        Test2 a = new Test2();
        int[] arr = {6, 42, 11, 7, 1, 42};
        int x = 7;
        int y = 42;
        System.out.println(a.longestFragment(arr, x, y));

        int[] arr1 = {13, 13, 1, 6};
        x = 6;
        y = 13;
        System.out.println(a.longestFragment(arr1, x, y));

        int[] arr2 = {100, 63, 100, 6, 2};
        x = 100;
        y = 63;
        System.out.println(a.longestFragment(arr2, x, y));

        int[] arr3 = {10, 32, 100, 64, 2, 55, 22};
        x = 10;
        y = 64;
        System.out.println(a.longestFragment(arr3, x, y));

        int[] arr4 = {};
        x = 10;
        y = 64;
        System.out.println(a.longestFragment(arr4, x, y));


    }

    public int longestFragment(int[] arr, int x, int y) {
        int indOfX = 0;
        int indOfY = 0;
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indOfX = i;
                countX++;
                if (countX >= 1 && countY >= 1 && countX == countY) {
                    break;
                }
            } else if (arr[i] == y) {
                indOfY = i;
                countY++;
                if (countX >= 1 && countY >= 1 && countX == countY) {
                    break;
                }
            }
        }

        int temp = Math.max(indOfX, indOfY);

        if (countX == 0 || countY == 0) {
            return -1;
        } else if (countX == countY && temp == arr.length - 1) {
            return temp;
        } else if (countX == countY && (arr[temp + 1] == x || arr[temp + 1] == y)) {
            return temp;
        }
        for (int j = temp + 2; j < arr.length; j++) {
            if (arr[j] == x) {
                countX++;
                if (countX != countY) {
                    return j - 1;
                }
            } else if (arr[j] == y) {
                countY++;
                if (countX != countY) {
                    return j - 1;
                }
            }
        }
        if (countX != countY) {
            return -1;
        }
        return arr.length - 1;
    }
}