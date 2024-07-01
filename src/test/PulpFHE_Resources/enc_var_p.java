class EncVar {

    public static void main(String[] str) {
        EncInt y;
        EncIntList x;
        x = PrivateTape.readList(10);

        y = Processor.var(x);

        Processor.answer(y);

    }

}
