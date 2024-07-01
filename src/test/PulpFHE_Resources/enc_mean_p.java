class EncMean {

    public static void main(String[] str) {
        EncInt y;
        EncIntList x;
        x = PrivateTape.readList(10);

        y = Processor.mean(x);

        Processor.answer(y);

    }

}
