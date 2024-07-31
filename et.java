public class LotteryPrinter {
    public static void main(String[] args) {
        int[] winningLottoNumber = {3, 15, 7, 22, 1, 30};

        for (int i = 0; i < winningLottoNumber.length; i++) {
            System.out.printf("%02d\n", winningLottoNumber[i]);
        }
    }
}
