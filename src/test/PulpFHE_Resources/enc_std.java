class EncStd {

    public static void main(String[] str) {
        EncInt y;
        EncIntList x;
        x = PrivateTape.readList(3);

        y = Processor.std(x);

        Processor.answer(y);

    }

}
