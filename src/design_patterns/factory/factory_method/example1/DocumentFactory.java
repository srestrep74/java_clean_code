package design_patterns.factory.factory_method.example1;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument(){
        Document doc = this.createDocument();
        doc.open();
    }
}

/*

public class Main{

    public static void main(String [] args) {
        DocumentFactory factory = new WordDocumentFactory();

        factory.openDocument();

        // Opening Word document
    }

}

*/
