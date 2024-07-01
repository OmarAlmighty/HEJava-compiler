class EncSqrt {

    public static void main(String[] a) {
        EncInt x;
        EncInt y;
        x = PrivateTape.read();
        y = Processor.sqrt(x);
        Processor.answer(y);
    }

}
