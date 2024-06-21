class EncRelu {

    public static void main(String[] a) {
        EncInt x;
        EncInt y;
        x = PrivateTape.read();
        y = Processor.relu(x);
        Processor.answer(y);
    }

}
