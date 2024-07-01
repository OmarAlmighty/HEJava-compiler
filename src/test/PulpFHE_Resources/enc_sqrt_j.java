
class EncSqrtJu {

    public static void main(String[] a) {
        int size = 8;
        EncInt AA;
        EncInt x;
        EncInt y;
        EncInt x_y;
        EncInt x_2;
        EncInt zero;
        EncInt one;
        EncInt two;

        EncInt Q;
        EncInt A;
        EncInt M;
        EncInt tmp;
        EncInt msb;
        EncInt A_msb;
        EncInt not_A_msb;
        EncInt A_m;
        EncInt cond;

        zero = PrivateTape.read();
        one = PrivateTape.read();
        two = PrivateTape.read();

        AA = PrivateTape.read();
        x = AA;
        y = one;
        x_y = x + y;

        Q = x_y;
        M = two;

        // itr 1
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


        x = Q;
        Q = AA;
        M = x;
        A = zero;

        for (int j1 = 0; j1 < size; j1++) {
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
        y = Q;
        // itr 1 end

        x_y = x + y;
        Q = x_y;
        M = two;
        A = zero;
        // itr 2
        for (int i2 = 0; i2 < size; i2++) {
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


        x = Q;
        Q = AA;
        M = x;
        A = zero;

        for (int j2 = 0; j2 < size; j2++) {
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
        y = Q;
        // itr 2 end

        x_y = x + y;
        Q = x_y;
        M = two;
        A = zero;
        // itr 3
        for (int i3 = 0; i3 < size; i3++) {
            // Left shift
            tmp = Q << 1;

            // Get the M2SB
            msb = Q >> (size - 1);
            msb = msb & one;

            Q = tmp;

            // Shift A to the left
            A = A << 1;

            // Replace A's LSB with the M2SB
            A = A & (~one);
            A = A | msb;

            A = A - M;

            // Get the M2SB of A
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


        x = Q;
        Q = AA;
        M = x;
        A = zero;
        for (int j3 = 0; j3 < size; j3++) {
            // Left shift
            tmp = Q << 1;

            // Get the M2SB
            msb = Q >> (size - 1);
            msb = msb & one;

            Q = tmp;

            // Shift A to the left
            A = A << 1;

            // Replace A's LSB with the M2SB
            A = A & (~one);
            A = A | msb;

            A = A - M;

            // Get the M2SB of A
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
        y = Q;
        // itr 3 end

        x_y = x + y;
        Q = x_y;
        M = two;
        A = zero;
        // itr 4
        for (int i4 = 0; i4 < size; i4++) {
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


        x = Q;
        Q = AA;
        M = x;
        A = zero;

        for (int j4 = 0; j4 < size; j4++) {
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
        y = Q;
        // itr 4 end


        x_y = x + y;
        Q = x_y;
        M = two;
        A = zero;
        // itr 5
        for (int i5 = 0; i5 < size; i5++) {
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


        x = Q;
        Q = AA;
        M = x;
        A = zero;

        for (int j5 = 0; j5 < size; j5++) {
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
        y = Q;
        // itr 5 end
        

        Processor.answer(x);

    }
}



