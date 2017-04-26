import java.util.Enumeration;
import java.util.Hashtable;
import java.io.*;

public class Monkey13 {
        static private int c = 27;
        public static int d;
        public static boolean x = true;
        static Hashtable<Integer, String> alphabravo = new Hashtable<Integer, String>(
                        c);
        public static BufferedReader Seraphim = new BufferedReader(new InputStreamReader(System.in));

        // private static FileWriter Brick;
        // private static FileReader Fist;

        /**
         * take input char by char and find the ASCII code and then use the
         * hashtable to encrypt each character to the output stream.
         */

        public Monkey13(int initialCapacity) {

                String[] shield = new String[95];
                shield[0] = "00";
                shield[1] = "01";
                shield[2] = "02";
                shield[3] = "03";
                shield[4] = "04";
                shield[5] = "05";
                shield[6] = "06";
                shield[7] = "07";
                shield[8] = "08";
                shield[9] = "09";
                shield[10] = "0a";
                shield[11] = "0b";
                shield[12] = "0c";
                shield[13] = "10";
                shield[14] = "11";
                shield[15] = "12";
                shield[16] = "13";
                shield[17] = "14";
                shield[18] = "15";
                shield[19] = "16";
                shield[20] = "17";
                shield[21] = "18";
                shield[22] = "19";
                shield[23] = "1A";
                shield[24] = "1B";
                shield[25] = "1C";
                shield[26] = "20";
                shield[27] = "Zz";
                shield[28] = "pI";
                shield[29] = "Q0";
                shield[30] = "k0";
                shield[31] = "2j";
                shield[32] = "30";
                shield[33] = "40";
                shield[34] = "50";
                shield[35] = "60";
                shield[36] = "70";
                shield[37] = "80";
                shield[38] = "90";
                shield[39] = "a0";
                shield[40] = "b0";
                shield[41] = "c0";
                shield[42] = "88";
                shield[43] = "87";
                shield[44] = "86";
                shield[45] = "85";
                shield[46] = "84";
                shield[47] = "83";
                shield[48] = "82";
                shield[49] = "81";
                shield[50] = "8b";
                shield[51] = "91";
                shield[52] = "A1";
                shield[53] = "B1";
                shield[54] = "C1";
                shield[55] = "c1";
                shield[56] = "d1";
                shield[57] = "e1";
                shield[58] = "l1";
                shield[59] = "w1";
                shield[60] = "Cw";
                shield[61] = "Ce";
                shield[62] = "Cd";
                shield[63] = "Ct";
                shield[64] = "Cb";
                shield[65] = "C7";
                shield[66] = "C4";
                shield[67] = "g1";
                shield[68] = "g6";
                shield[69] = "g3";
                shield[70] = "g8";
                shield[71] = "g2";
                shield[72] = "J1";
                shield[73] = "J0";
                shield[74] = "D1";
                shield[75] = "M2";
                shield[76] = "O3";
                shield[77] = "P4";
                shield[78] = "D2";
                shield[79] = "M1";
                shield[80] = "O4";
                shield[81] = "P3";
                shield[82] = "D5";
                shield[83] = "M3";
                shield[84] = "O7";
                shield[85] = "P4";
                shield[86] = "Dd";
                shield[87] = "Mr";
                shield[88] = "Oy";
                shield[89] = "Pi";
                shield[90] = "Do";
                shield[91] = "Me";
                shield[92] = "On";
                shield[93] = "Pa";
                shield[94] = "oN";

                for (int i = 32, a = 0; i <= 126; i++, a++) {
                        Integer integer = new Integer(i);
                        alphabravo.put(integer, shield[a]);
                }

        }

        /**
         * @param args
         */

        public int fishing() {
                return 0;

        }

        
        public void FileReader(String name) throws FileNotFoundException {

        }

        public static void main(String[] args) throws IOException {
                Monkey13 m = new Monkey13(95);
                System.out.println("Hello");

                // open file
                System.out.println("Please type the name of the file to be written to, with the extension: ");
                FileWriter Brick = new FileWriter(new File(Seraphim.readLine()));
                System.out.println("Please type the name of the file to be encrypted: ");
                FileReader Fist = new FileReader(new File(Seraphim.readLine()));
                while ((x == true) && (d != -1)) {
                        d = Fist.read();
                        while ((d != -1) && (x == true)) {
                        //System.out.println(d);
                        if (alphabravo.get(d) != null) {
                                        Brick.write(alphabravo.get(d));
                                        System.out.println("nuts to you");
                                        
                                        
                                } else {
                                        
                                        
                                        System.out.println("Please insert $60 to continue the game...");
                                        
                                        System.out.println("booyakasha");
                                        d = -1;
                                        x = false;
                                }
                                d = Fist.read();

                        } 
                }
                Brick.close();

                // while char

                // read write
                // TODO Auto-generated method stub
                /*
                 * for (Enumeration e = alphabravo.keys(); e.hasMoreElements();){ String
                 * str = (String) alphabravo.get(e.nextElement()); System.out.println
                 * (str);
                 */
        }

}
