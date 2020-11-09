public class MainOne {
    public int[] addArr(int[] arr) {
        String str = "";
        int count = 0;
        for (int element : arr) {
            if (element == 4) {
                count++;
            }
        }

        if (count > 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] == 4) {
                    break;
                } else {
                    str = str + arr[i];
                }
            }
            String strReserve = new StringBuffer(str).reverse().toString();
            String[] arrEx = strReserve.split("");
            int[] array = new int[arrEx.length];
            for (int i = 0; i < arrEx.length; i++) {
                array[i] = Integer.parseInt(arrEx[i]);
            }
            return array;
        } else {
            throw new RuntimeException("Не найдено 4 в массиве!");
        }
    }
}

