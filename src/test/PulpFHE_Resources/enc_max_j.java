
class EncReluJ {

    public static void main(String[] a) {
        int n_nums = 10;
        EncInt x1;
        EncInt x2;
        EncInt max;
        EncInt tmp;
        EncInt zero;
        EncInt one;

        zero = PrivateTape.read();
        one = PrivateTape.read();
        x1 = PrivateTape.read();
        x2 = PrivateTape.read();

        tmp = (x1 > x2);
        max = (tmp * x1) + ((one - tmp) * x2);

        for (int i = 0; i < (n_nums-2); i++) {
            x2 = PrivateTape.read();
            tmp = (max > x2);
            max = (tmp * max) + ((one - tmp) * x2);
        }

        Processor.answer(max);

    }
}



