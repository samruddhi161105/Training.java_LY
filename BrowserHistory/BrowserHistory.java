package BrowserHistory ;

import java.util.LinkedList;
import java.util.List;

public class BrowserHistory {

    List<String> history = new LinkedList<>();

    List<String> forwardHistory = new LinkedList<>();

    // visitPage
    public void visitPage(String page) {
        history.addLast(page);

        forwardHistory.clear();
        System.out.println(page + " is visited");
    }

    // goback
    void goBack() {
        if (history.size() <= 1) {
            System.out.println("No previous page available");
        }

        String currentPage = history.removeLast();

        forwardHistory.addLast(currentPage);

        System.out.println("Now your current page is " + history.getLast());

    }

    // goforward
    void goForward() {
        if (forwardHistory.isEmpty()) {
            System.out.println("No forward page is available");
        }

        String page = forwardHistory.removeLast();

        history.addLast(page);

        System.out.println("Current page : " + history.getLast());
    }

    // displayallhistory

    void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("No history available");
        }
        System.out.println("================Browser History==============");
        for (String st : history) {
            System.out.println(st);
        }
    }

    void PrintCurrentPage() {
        if (history.isEmpty()) {
            System.out.println("No Page is visited!!");
        }

        System.out.println("Your current page is : " + history.getLast());

    }

}