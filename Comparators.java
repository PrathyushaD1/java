import java.util.*;
class player
{
    private String name;
    private int score;

    public player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "{" + "name='" + name + '\'' +
                ", score" + score + '}';
    }

    public String getName() {
        return name;
    }

    public int getscore() {
        return score;
    }
}

public class Comparators
{
    public static void main(String[] args)
    {
        player[] p = { new player("John", 15), new player("Sam", 20),
                new player("Dan", 20), new player("Joe", 10), new player("Arry",40) };

        Arrays.sort(p, new Comparator<player>() {
            @Override
            public int compare(player first, player second)
            {
                if (first.getscore() != second.getscore()) {
                    return second.getscore() - first.getscore();
                }
                return first.getName().compareTo(second.getName());
            }
        });

        System.out.println(Arrays.toString(p));

    }
}
