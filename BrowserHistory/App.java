package BrowserHistory;

public class App {
    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("Amazon");
        browser.visitPage("Flipkart");
        browser.visitPage("Netflix");
        browser.visitPage("Instagram");

        browser.displayHistory();

        // browser.PrintCurrentPage();

        browser.goBack();

        browser.goBack();

        // browser.goForward();

        // browser.goForward();

        // browser.goForward();

        browser.visitPage("geeksforgeeks");

        browser.goForward();

    }
}
