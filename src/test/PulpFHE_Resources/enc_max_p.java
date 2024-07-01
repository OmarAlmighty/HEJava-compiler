class EncMax {
    public static void main(String[] str) {
        EncInt y;
        EncIntList x;
        x = PrivateTape.readList(10);

        y = Processor.max(x);

        Processor.answer(y);

    }

}
