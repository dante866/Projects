package chaocipher;

public class Main {

    public static String target;
    public static String pre_op;
    public static String mid;
    public static String encoding;
    public static String decoding;
    public static void main(String[] args) {
	encoding = "HXUCZVAMDSLKPEFJRIGTWOBNYQ";
	decoding = "PTLNBQDEOYSFAVZKGJRIHWXUMC";
        Chaocipher ch = new Chaocipher(encoding,
                decoding);
        target = "WELLDONEISBETTERTHANWELLSAID";
        mid = ch.encrypt(target);
        pre_op = ch.decrypt(mid);
        System.out.println(target);
        System.out.println();
        System.out.println(mid);
        System.out.println();
        System.out.println(pre_op);
        System.out.println();
        System.out.println(encoding);
        System.out.println(decoding);
    }

}
