package org.victor.chapter1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileNameFilterTest {
    public static void main(String[] args) {
        var directory = new File("./src/org/victor/chapter1");
        var names = directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        var lambdaNames = directory.list((dir, name) -> name.endsWith(".java"));
        System.out.println("Old way:\n" + Arrays.asList(names));
        System.out.println("With lambda:\n " + Arrays.asList(names));
    }
}
