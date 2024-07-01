class EncStd {

    public static void main(String[] str) {
        EncInt y;
        EncIntList x;
        x = PrivateTape.readList(10);

        y = Processor.std(x);

        Processor.answer(y);

    }

}
