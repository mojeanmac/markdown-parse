import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile2() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test2.md"));
        List<String> expect = List.of("https://duckduckgo.com", "https://kde.org");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile3() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test3.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile4() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    //Prof's tests
    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile3() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file3.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile4() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile5() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file5.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile6() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile7() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile8() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/mojea/Documents/Winter 2022/CSE 15L/markdown-parse/test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
}
