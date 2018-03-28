package printrootdir;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File[] rDirs = File.listRoots();
        for (int i = 0; i < rDirs.length; i++)
            System.out.println(rDirs[i].toString());
    }

}
