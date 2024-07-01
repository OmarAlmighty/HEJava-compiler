
class EncDivJ {

    public static void main(String[] a) {
        int size = 16;
        EncInt Q;
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

        Q = PrivateTape.read();
        M = PrivateTape.read();
        one = PrivateTape.read();
        zero = PrivateTape.read();
        A = zero;

        //Q = Q << 1;
        // EQtract LSB
//        y = Q & one;
//        y = y | zero;

        // EQtract the msb
//        Q = Q >> (size-1);
//        Q = Q & one;

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
        Processor.answer(Q);

    }
}



