public class MainTwo {
    public boolean oneAndFour(int[] arr) {
        boolean oneAndFour = false;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
                if (arr[i] == 1) {
                    count1++;
                } else {
                    if (arr[i] == 4) {
                        count2++;
                    }
                }

                if (count1 > 0 && count2 > 0) {
                    oneAndFour = true;
                } else {
                    oneAndFour = false;
                }
            } else {
                oneAndFour = false;
                break;
            }
        }
        return oneAndFour;
    }
}
