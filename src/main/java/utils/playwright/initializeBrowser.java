package utils.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class initializeBrowser {

    public Browser getBrowser() {
        try (Playwright playwright = Playwright.create()) {
            BrowserType browserType = playwright.chromium();
            return browserType.launch();
        }
    }

}
