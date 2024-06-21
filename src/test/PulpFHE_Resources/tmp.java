class EncAdd {

    public static void main(String[] a) {
        EncInt x;
        EncInt y;
        EncInt z;
        x = PrivateTape.read();
        y = PrivateTape.read();
        z = x + y;
        Processor.answer(z);
    }

}
