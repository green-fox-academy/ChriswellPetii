class Anagram {
    String s1;
    String s2;

    boolean areAnagram(char[] s1, char[] s2) {
        int ls1 = s1.length;
        int ls2 = s2.length;

        if (ls1 != ls2) {
            return false;
        }
        quickSort(s1, 0, ls1 - 1);
        quickSort(s2, 0, ls2 - 1);

        for (int i = 0; i < ls1; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }

    private static void exchange(char A[], int a, int b) {
        char temp;
        temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

    private static int partition(char A[], int si, int ei) {
        char x = A[ei];
        int i = (si - 1);
        int j;

        for (j = si; j <= ei - 1; j++) {
            if (A[j] <= x) {
                i++;
                exchange(A, i, j);
            }
        }
        exchange(A, i + 1, ei);
        return (i + 1);
    }

    private static void quickSort(char A[], int si, int ei) {
        int pi;    /* Partitioning index */
        if (si < ei) {
            pi = partition(A, si, ei);
            quickSort(A, si, pi - 1);
            quickSort(A, pi + 1, ei);
        }
    }

    private void spliter() {

    }
}
