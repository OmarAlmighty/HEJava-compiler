
class EncVarJ {

    public static void main(String[] a) {
        int size = 16;
        int n = 10;
        EncInt[] arr = new EncInt[n];
        EncInt x;
        EncInt sum;
        EncInt two;
        EncInt Q;
        EncInt A;
        EncInt A1;
        EncInt M;
        EncInt tmp;
        EncInt one;
        EncInt zero;
        EncInt msb;
        EncInt A_msb;
        EncInt not_A_msb;
        EncInt A_m;
        EncInt cond;
        EncInt mean;
        EncInt var;

        M = PrivateTape.read();
        zero = PrivateTape.read();
        one = PrivateTape.read();
        A = zero;
        mean = zero;
        var = zero;
//        Q = zero;

        for (int j = 0; j < n; j++) {
            x = PrivateTape.read();
            Q = Q + x;
        }

        // Division block
        for (int i = 0; i < size; i++) {
            // Left shift
            tmp = Q << 1;

            // Get the MSB
            msb = Q >> (size - 1);
            msb = msb & one;

            Q = tmp;

            // Shift A to the left
            A = A << 1;

            // Replace A's LSB with the MSB
            A = A & (~one);
            A = A | msb;

            A = A - M;

            // Get the MSB of A
            A_msb = A >> (size - 1);
            A_msb = A_msb & one;

            not_A_msb = one ^ A_msb;

            // Replace the Q's LSB with not_A_msb
            Q = Q & (~one);
            Q = Q | not_A_msb;

            A_m = A + M;

            cond = (A_msb == one);
            A = (A_m * cond) + ((one - cond) * A);

        }
        // End of Division

        mean = Q;

        for (int k = 0; k < n; k++) {
            x = PrivateTape.read();
            tmp = x - mean;
            tmp = tmp * tmp;
            var = var + tmp;
        }

        Q = var;
        A = PrivateTape.read();

        for (int i1 = 0; i1 < size; i1++) {
            // Left shift
            tmp = Q << 1;

            // Get the MSB
            msb = Q >> (size - 1);
            msb = msb & one;

            Q = tmp;

            // Shift A to the left
            A = A << 1;

            // Replace A's LSB with the MSB
            A = A & (~one);
            A = A | msb;

            A = A - M;

            // Get the MSB of A
            A_msb = A >> (size - 1);
            A_msb = A_msb & one;

            not_A_msb = one ^ A_msb;

            // Replace the Q's LSB with not_A_msb
            Q = Q & (~one);
            Q = Q | not_A_msb;

            A_m = A + M;

            cond = (A_msb == one);
            A = (A_m * cond) + ((one - cond) * A);

        }

        Processor.answer(Q);

    }
}



