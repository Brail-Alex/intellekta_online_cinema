package org.example;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun
{
    public static void main( String[] args )
    {
        List<Viewer> viewers = new ArrayList();
        viewers.add(new Viewer("John", (byte) 18, new ArrayList<>()));
        viewers.add(new Viewer("Max", (byte) 25, new ArrayList<>()));
        viewers.add(new Viewer("Marta", (byte) 19, new ArrayList<>()));
        viewers.add(new Viewer("Helga", (byte) 45, new ArrayList<>()));
        viewers.add(new Viewer("Oxy", (byte) 29, new ArrayList<>()));
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
