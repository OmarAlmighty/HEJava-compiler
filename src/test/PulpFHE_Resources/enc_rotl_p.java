class EncRotl {
    public static void main(String[] a) {
        EncInt x;
        EncInt z;
        x = PrivateTape.read();
        z = x <<< 8;
        Processor.answer(z);
    }

}
