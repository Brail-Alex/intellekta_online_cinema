package org.example;

import java.util.List;

public class ViewerStatistics {
    public static int averageAge(List<Viewer> viewerList) {
        int averageAgeViwers = 0;
        for (int i = 0; i < viewerList.toArray().length; i++) {
            averageAgeViwers += viewerList.get(i).getAge();
        }
        if (averageAgeViwers != 0) {
            return (averageAgeViwers /= viewerList.toArray().length);
        }
        return 0;
    }
}
