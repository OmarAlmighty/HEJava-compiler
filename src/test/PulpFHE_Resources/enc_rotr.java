class EncRotr {
    public static void main(String[] a) {
        EncInt x;
        EncInt z;
        x = PrivateTape.read();
        z = x >>> 3;
        Processor.answer(z);
    }

}
