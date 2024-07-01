class EncBlake3 {
    public static void main(String[] str) {
        EncIntList y;
        EncIntList x;
        x = PrivateTape.readList(2);

        y = Processor.blake3(x);

        Processor.answer(y);

    }

}
