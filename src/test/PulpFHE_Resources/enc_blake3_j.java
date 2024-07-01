class EncBlake3J {
    public static void main(String[] str) {
        EncInt iv0;
        EncInt iv1;
        EncInt iv2;
        EncInt iv3;
        EncInt iv4;
        EncInt iv5;
        EncInt iv6;
        EncInt iv7;

        EncInt m0;
        EncInt m1;

        EncInt a;
        EncInt b;
        EncInt c;
        EncInt d;

        EncInt ones;

        ones = PrivateTape.read();
        iv0 = PrivateTape.read();
        iv1 = PrivateTape.read();
        iv2 = PrivateTape.read();
        iv3 = PrivateTape.read();
        iv4 = PrivateTape.read();
        iv5 = PrivateTape.read();
        iv6 = PrivateTape.read();
        iv7 = PrivateTape.read();

        m0 = PrivateTape.read();
        m1 = PrivateTape.read();

        a = a + b;
        a = a + m0;
        d = d ^ a;
        d = (d >> 16);
        d = d | (d << (32 - 16));
        d = d & ones;
        c = c + d;
        b = b ^ c;
        b = (b >> 12);
        b = b |(b << (32 - 12));
        b = b & ones;
        a = a + b;
        a = a + m1;
        d = d ^ a;
        d = (d >> 8);
        d = d |(d << (32 - 8));
        d = d & ones;
        c = c + d;
        b = b ^ c;
        b = (b >> 7);
        b = b |(b << (32 - 7));
        b = b & ones;

        Processor.answer(b);


    }

}