package Visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String searchPattern;
    private List<File> matchingFiles;

    public SearchVisitor(String searchPattern) {
        this.searchPattern = searchPattern;
        this.matchingFiles = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchPattern)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // No action needed for directory itself
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}