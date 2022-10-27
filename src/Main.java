import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println("Try to find the word\n");
        System.out.println(HEAD);

        Scanner sc = new Scanner(System.in);

        int random = new Random().nextInt(0, wordsList.length-1);

        StringBuilder word = wordsList[random];
        StringBuilder word2 = new StringBuilder(substitution(10,word.toString()));

        System.out.println(word2);

        while(word2.compareTo(word) != 0 && turn < 5)
        {
            String answer = sc.nextLine();

            if(word.toString().contains(answer))
            {
                for (int i = 0; i < word2.length(); i++)
                {
                    if(word2.charAt(i) == '-' && word.charAt(i) == answer.charAt(0))
                    {
                        word2.setCharAt(i,answer.charAt(0));
                    }

                }
            }
            else
            {
                turn++;
            }

            System.out.println(levels[turn]);
            System.out.println(word2);

        }

        if(word2.compareTo(word) == 0)
            System.out.println("Bravo!👍");
        else if(turn == 5)
            System.out.println("The word was " + word + " you sussy baka 🥱");
    }

    public static String substitution(int number,String word)
    {
        for (int i = 0; i < number ; i++)
        {
            int charToReplace = new Random().nextInt(0,word.length()-1);
            word = word.replace(word.charAt(charToReplace),'-');
        }

        return word;
    }

    private final static String HEAD = """
                    O
            """;

    private final static String TRUNK = """
                    O
                    |
                    |
                    |
            """;

    private final static String ARM = """
                    O
                    |
                   /|
                  / |
            """;

    private final static String ARMS = """
                    O
                    |
                   /|\\
                  / | \\
            """;

    private final static String LEG = """
                    O
                    |
                   /|\\
                  / | \\
                   /\s
                  / \s
            """;

    private final static String BODY = """     
                	O
                    |
                   /|\\
                  / | \\
                   / \\
                  /   \\
            """;
    private final static String[] levels = {HEAD,TRUNK,ARM,ARMS,LEG,BODY};

    private static byte turn = 0;

    private static StringBuilder[] wordsList = {new StringBuilder("venus"), new StringBuilder("access"),new StringBuilder("ceremony"),new StringBuilder("combination"),new StringBuilder("stock"),new StringBuilder("shirt"),new StringBuilder("balloon"),new StringBuilder("offer"),new StringBuilder("witch"),new StringBuilder("lobby"),new StringBuilder("mummy"),new StringBuilder("declaim"),new StringBuilder("hornet"),new StringBuilder("orient"),new StringBuilder("meat"),new StringBuilder("square"),new StringBuilder("observatory"),new StringBuilder("enclose"),new StringBuilder("democracy"),new StringBuilder("holland"),new StringBuilder("pronounce"),new StringBuilder("firewood"),new StringBuilder("naphtalene"),new StringBuilder("peace"),new StringBuilder("gossip"),new StringBuilder("skylight"),new StringBuilder("bullet"),new StringBuilder("wedding"),new StringBuilder("jacket"),new StringBuilder("trumpet"),new StringBuilder("waves"),new StringBuilder("equipment"),new StringBuilder("maroon"),new StringBuilder("final"),new StringBuilder("hood"),new StringBuilder("frog"),new StringBuilder("avenue"),new StringBuilder("cat"),new StringBuilder("clap"),new StringBuilder("clean"),new StringBuilder("industry"),new StringBuilder("swamp"),new StringBuilder("echo"),new StringBuilder("duster"),new StringBuilder("cover"),new StringBuilder("exercise"),new StringBuilder("alien"),new StringBuilder("sable"),new StringBuilder("miner"),new StringBuilder("digestion"),new StringBuilder("claustrophobia"),new StringBuilder("helix"),new StringBuilder("novice"),new StringBuilder("evaporate"),new StringBuilder("velodrome"),new StringBuilder("abduct"),new StringBuilder("traffic"),new StringBuilder("crude"),new StringBuilder("ray"),new StringBuilder("retouch"),new StringBuilder("dehydrated"),new StringBuilder("life"),new StringBuilder("flower"),new StringBuilder("remos"),new StringBuilder("mouth"),new StringBuilder("rattle"),new StringBuilder("purse"),new StringBuilder("throat"),new StringBuilder("stay"),new StringBuilder("hero"),new StringBuilder("translator"),new StringBuilder("cream"),new StringBuilder("patient"),new StringBuilder("well"),new StringBuilder("crude"),new StringBuilder("bet"),new StringBuilder("plectrum"),new StringBuilder("speaker"),new StringBuilder("bricks"),new StringBuilder("symbol"),new StringBuilder("pantheon"),new StringBuilder("electricity"),new StringBuilder("beat"),new StringBuilder("sidewalk"),new StringBuilder("blonde"),new StringBuilder("ten"),new StringBuilder("pedestal"),new StringBuilder("insomnia"),new StringBuilder("weave"),new StringBuilder("free"),new StringBuilder("countries"),new StringBuilder("kitchen"),new StringBuilder("toaster"),new StringBuilder("disadvantage"),new StringBuilder("pain"),new StringBuilder("hardness"),new StringBuilder("captive"),new StringBuilder("swoop"),new StringBuilder("waist"),new StringBuilder("brother")};

}