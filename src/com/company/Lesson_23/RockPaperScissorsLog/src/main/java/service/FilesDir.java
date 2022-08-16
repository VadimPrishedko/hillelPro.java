package service;

import java.io.*;
import java.util.Scanner;

public class FilesDir {
    String fileName;
    File file;

    public FilesDir(String file) {
        this.fileName = file;
    }

    public boolean addFile() throws IOException {
        file = new File(fileName);

        if (!file.exists()) {
            file.createNewFile();
            return true;
        }
        return false;
    }

    public boolean writeToFile(File file, String text) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(text + "\n");
//            writer.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean deleteContent() {
        try {
            FileWriter fstream1 = new FileWriter(file);
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();
        } catch (Exception e) {
            System.err.println("Error in file cleaning: " + e.getMessage());
            return false;
        }
        return true;
    }


    public File getFile() {
        return file;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                str.append(sc.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return String.valueOf(str);
    }
}

