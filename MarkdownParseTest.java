import static org.junit.Assert.*;
import org.junit.*;

import java.beans.Transient;
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
    public void mytest() throws IOException{
        String contents= Files.readString(Path.of("mytest.md"));
        List<String> expect = List.of("thebomb.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile2() throws IOException {
        String contents = Files.readString(Path.of("test2.md"));
        List<String> expect = List.of("https://duckduckgo.com", "https://kde.org");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile3() throws IOException {
        String contents = Files.readString(Path.of("test3.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testMyFile4() throws IOException {
        String contents = Files.readString(Path.of("test4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    //Prof's tests
    @Test
    public void testFile2() throws IOException {
        String contents= Files.readString(Path.of("test-file2.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile3() throws IOException {
        String contents = Files.readString(Path.of("test-file3.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile4() throws IOException {
        String contents = Files.readString(Path.of("test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testFile5() throws IOException {
        String contents = Files.readString(Path.of("test-file5.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile6() throws IOException {
        String contents = Files.readString(Path.of("test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile7() throws IOException {
        String contents = Files.readString(Path.of("test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void testFile8() throws IOException {
        String contents = Files.readString(Path.of("test-file4.md"));
        List<String> expect = List.of();
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void snippet1() throws IOException{
        String contents = Files.readString(Path.of("snippet-1.md"));
        List<String> expect = List.of("%60google.com", "google.com", "ucsd.edu");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void snippet2() throws IOException{
        String contents = Files.readString(Path.of("snippet-2.md"));
        List<String> expect = List.of("a.com", "a.com(())", "example.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    @Test
    public void snippet3() throws IOException{
        String contents = Files.readString(Path.of("snippet-3.md"));
        List<String> expect = List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
}
