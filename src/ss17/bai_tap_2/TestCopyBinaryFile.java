package ss17.bai_tap_2;

public class TestCopyBinaryFile {
    public static void main(String[] args) {
        final String SOURCE = "src/ss17/bai_tap_2/target.txt";
        final String TARGET = "src/ss17/bai_tap_2/target.txt";
        CopyBinary.copyFileBinary(SOURCE,TARGET);
        CopyBinary.targetFileLength(TARGET);
    }
}
