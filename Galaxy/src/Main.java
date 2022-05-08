
import sun.jvm.hotspot.memory.Universe;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Universe universe = new Universe("INPUT.TXT");
        System.out.println("*****************************");
        universe.printAllTonnels();
        System.out.println("*****************************");
        List<Tonnel> tonnelList= universe.getAllTonnel();
        for (Tonnel t:tonnelList  ) {
            System.out.println(t);
        }

        System.out.println("////////////////////////////////////////////////////");
        System.out.println("наилучший путь: "+universe.findBestPath());

    }

    public static void testPath(List<Tonnel> tonnelList)
    {
        System.out.println("-------------------test SpacePath--------------");
        SpacePath a = new SpacePath();
        a.steps.add(tonnelList.get(1));
        a.steps.add(tonnelList.get(4));
        System.out.println(a);
        SpacePath b = new SpacePath(a);
        a.steps.add(tonnelList.get(5));
        System.out.println(a);
        System.out.println(b);
    }
}
