
class EncSxrtJ {

    public static void main(String[] a) {
        int size = 8;
        int n_itrs = 5;
        EncInt val;
        EncInt y;
        EncInt two;
        EncInt A;
        EncInt M;
        EncInt tmp;
        EncInt one;
        EncInt zero;
        EncInt msb;
        EncInt A_msb;
        EncInt not_A_msb;
        EncInt A_m;
        EncInt cond;
        EncInt n_one;
        EncInt x;

        val = PrivateTape.read();
        zero = PrivateTape.read();
        one = PrivateTape.read();
        two = PrivateTape.read();
        n_one = ~one;
        A = zero;
        x = val;

        y = val + one;
        M = two;

        // Division block
        for (int i = 0; i < size; i++) {
            // Left shift
            tmp = y << 1;

            // Get the MSB
            msb = y >> (size - 1);
            msb = msb & one;

            y = tmp;

            // Shift A to the left
            A = A << 1;

            // Replace A's LSB with the MSB
            A = A & (n_one);
            A = A | msb;

            A = A - M;

            // Get the MSB of A
            A_msb = A >> (size - 1);
            A_msb = A_msb & one;

            not_A_msb = one ^ A_msb;

            // Replace the x's LSB with not_A_msb
            y = y & (n_one);
            y = y | not_A_msb;

            A_m = A + M;

            cond = (A_msb == one);
            A = (A_m * cond) + ((one - cond) * A);

        }

        // End of Division

        for (int j = 0; j < n_itrs; j++) {
            x = y;
            y = x + val;
            A = zero;
            M = x;
            // Division block
            for (int k = 0; k < size; k++) {
                // Left shift
                tmp = y << 1;

                // Get the MSB
                msb = y >> (size - 1);
                msb = msb & one;

                y = tmp;

                // Shift A to the left
                A = A << 1;

                // Replace A's LSB with the MSB
                A = A & (n_one);
                A = A | msb;

                A = A - M;

                // Get the MSB of A
                A_msb = A >> (size - 1);
                A_msb = A_msb & one;

                not_A_msb = one ^ A_msb;

                // Replace the x's LSB with not_A_msb
                y = y & (n_one);
                y = y | not_A_msb;

                A_m = A + M;

                cond = (A_msb == one);
                A = (A_m * cond) + ((one - cond) * A);

            }

            M = two;
            A = zero;

            // Division block
            for (int cntr1 = 0; cntr1 < size; cntr1++) {
                // Left shift
                tmp = y << 1;

                // Get the MSB
                msb = y >> (size - 1);
                msb = msb & one;

                y = tmp;

                // Shift A to the left
                A = A << 1;

                // Replace A's LSB with the MSB
                A = A & (n_one);
                A = A | msb;

                A = A - M;

                // Get the MSB of A
                A_msb = A >> (size - 1);
                A_msb = A_msb & one;

                not_A_msb = one ^ A_msb;

                // Replace the x's LSB with not_A_msb
                y = y & (n_one);
                y = y | not_A_msb;

                A_m = A + M;

                cond = (A_msb == one);
                A = (A_m * cond) + ((one - cond) * A);
            }
        }


        Processor.answer(x);

    }
}



