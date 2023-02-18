import java.util.*;

public class hamming_calc {
    String id;
    String seq;
    public hamming_calc(String name, String sequence) // 
    {
        id = name;
        seq = sequence;
    }
    public String getid()
    {
        return id;
    }

    public String getSeq()
    {
        return seq;
    }
    public static String hamray(hamming_calc[] strs1, hamming_calc[] strs2) // inputs two arrays of hamming_calc objects, returns the distance between each element of each array
    {
        String endString = "";
        for (int x = 0; x < strs1.length; x++)
        {
            for (int y = 0; y < strs2.length; y++)
            {
                endString += strs1[x].getid() + " and " + strs2[y].getid() + " are " + hamster(strs1[x].getSeq(), strs2[y].getSeq()) + " apart \n";
                
            }
            
        }


        return endString;
    }
    public static int hamster(String str1, String str2) // inputs two strings, returns hamming distance
        {
            String shorter;
            int mismatchCount = 0;
            if (str1.length() > str2.length())
            {
                shorter = str2;
            }
            else 
            {
                shorter = str1;
            }
             
            for (int x = 0; x < shorter.length(); x++)
            {
                if (str1.charAt(x) != str2.charAt(x) && str1.charAt(x) != 'N' && str1.charAt(x) != '-' && str2.charAt(x) != 'N' && str2.charAt(x) != '-')
                {
                    mismatchCount++;
                }
            }
            
            return mismatchCount;
        }

    public static String raylength(hamming_calc[] in)
    {
        String out = "";
        for (int x = 0; x < in.length; x++)
        {
            out += in[x].getid() + " is " + in[x].getSeq().length() + " long \n";


        }
        return out;
    }


public static String findLets(hamming_calc[] in)
{
    ArrayList<String> lets = new ArrayList<String>();
    String current;
    boolean there;
    String charct;

    String out = "The letters found were ";

    for (int x = 0; x < in.length; x++)
        {
            current = in[x].getSeq();

            for (int y = 0; y < current.length(); y++)
            {
                there = true;

                for (int z = 0; z < lets.size(); z++)
                {
                    if (lets.get(z).charAt(0) == current.charAt(y))
                    {
                        there = false;
                    }
                }

                if (there)
                {
                    charct = Character.toString(current.charAt(y));
                    lets.add(charct);
                }

            }


        }
    
    for (String x : lets)
    {
        out += x;
    }
    return out;
}
}

    