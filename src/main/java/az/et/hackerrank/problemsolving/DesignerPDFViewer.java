package az.et.hackerrank.problemsolving;

public class DesignerPDFViewer {
  public static void main(String[] args) {
    System.out.println();
  }

  private static int designerPdfViewer(int[] h, String word) {
    return word.chars()
            .map(c -> c - 97)
            .map(idx -> h[idx])
            .max()
            .orElseThrow(RuntimeException::new) * word.length();
  }
}
