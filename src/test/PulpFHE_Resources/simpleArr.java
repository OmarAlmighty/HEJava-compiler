class SimpleArr {

    public static void main(String[] str) {
        EncInt y;
        EncIntList x;
        x = PrivateTape.readList(3);

        y = Processor.var(x);

        Processor.answer(y);

    }

}
