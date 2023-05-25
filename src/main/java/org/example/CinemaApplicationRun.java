package org.example;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun
{
    public static void main( String[] args )
    {
        List<Viewer> viewers = new ArrayList();
        viewers.add(new Viewer("John", (byte) 18,2));
        viewers.add(new Viewer("Max", (byte) 25, 9));
        viewers.add(new Viewer("Marta", (byte) 19, 7));
        viewers.add(new Viewer("Helga", (byte) 45, 0));
        viewers.add(new Viewer("Oxy", (byte) 29, 1));
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
