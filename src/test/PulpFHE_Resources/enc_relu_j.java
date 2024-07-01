
class EncReluJ {

    public static void main(String[] a) {
        EncInt x;
        EncInt tmp;
        EncInt zero;

        x = PrivateTape.read();
        zero = PrivateTape.read();

        tmp = (x > zero);
        x = (tmp * x);

        Processor.answer(x);

    }
}



