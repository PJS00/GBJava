package GB.Java.Les8.Dop.Ex006.Interface;

import GB.Java.Les8.Dop.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
