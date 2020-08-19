import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Paths;

class RenameFilesScript{
    public static void main(String[] args) {
      File directory = new File("/mnt/e/sem 1 anul 2 leo extra/LTM sursa 2");
      File[] myfiles = directory.listFiles();

      RenameFilesScript mainC = new RenameFilesScript();
      mainC.displayFiles(myfiles);
    }

	private void displayFiles(File[] files) {
		for (int i = 0; i < files.length; i++) {
        File newFile = new File("/mnt/e/sem 1 anul 2 leo extra/LTM sursa 2/" + Integer.toString(i)+".jpg");
        files[i].renameTo(newFile);
        }
    }
}