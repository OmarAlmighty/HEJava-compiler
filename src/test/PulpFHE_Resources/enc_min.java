class EncMin {
    public static void main(String[] str) {
        EncInt y;
        EncIntList x;
        x = PrivateTape.readList(3);

        y = Processor.min(x);

        Processor.answer(y);

    }

}
